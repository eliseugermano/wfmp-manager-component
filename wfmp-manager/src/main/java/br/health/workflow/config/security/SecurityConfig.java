package br.health.workflow.config.security;

import br.health.workflow.config.security.dto.UserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.cors.CorsConfiguration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private List<GrantedAuthority> authorities = new ArrayList<>();

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtUserDetailsService getUserDetails() {
        return new JwtUserDetailsService(authorities);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
                .and().csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/v2/api-docs",
                        "/swagger-resources/**",
                        "/swagger-ui.html",
                        "/webjars/**",
                        "/swagger.json").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager(), authorities, getUserDetails()))
                .addFilter(new JWTAuthorizationFilter(authenticationManager()));
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(getUserDetails()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Service
    public static class JwtUserDetailsService implements UserDetailsService {
        private List<GrantedAuthority> authorities;
        private UserDTO jwtUser = new UserDTO();

        public JwtUserDetailsService(List<GrantedAuthority> authorities) {
            this.authorities = authorities;
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            List<String> authoritiesValues = new ArrayList<>();
            authorities.forEach(authority -> authoritiesValues.add(authority.getAuthority()));

            return new User(
                    jwtUser.getUsername(),
                    encoder.encode(jwtUser.getPassword()),
                    AuthorityUtils.createAuthorityList(authoritiesValues.stream().toArray(String[]::new))
            );
        }

        public UserDTO getJwtUser() {
            return jwtUser;
        }
    }
}
