package br.health.workflow.config.security;

import br.health.workflow.config.security.dto.UserDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static br.health.workflow.config.security.SecurityConstants.*;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private static final Logger log = LoggerFactory.getLogger(JWTAuthenticationFilter.class);

    private AuthenticationManager authenticationManager;
    private List<GrantedAuthority> authorities;
    private SecurityConfig.JwtUserDetailsService jwtUser;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager, List<GrantedAuthority> authorities, SecurityConfig.JwtUserDetailsService jwtUser) {
        this.authenticationManager = authenticationManager;
        this.authorities = authorities;
        this.jwtUser = jwtUser;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            UserDTO userDTO = new ObjectMapper().readValue(request.getInputStream(), UserDTO.class);
            log.info("Operation: {} with username: {}", "attempt authentication", userDTO.getUsername());

            // user authentication
            log.info("Operation: {} with user: {}", "user authentication", userDTO.getUsername());

            // TODO: add roles according to user credentials
            // For testing purposes the role will be added based on the submitted profile
            authorities.clear();
            authorities.add(new SimpleGrantedAuthority("ROLE_"+userDTO.getProfile().toUpperCase()));

            jwtUser.getJwtUser().setUsername(userDTO.getUsername());
            jwtUser.getJwtUser().setPassword(userDTO.getPassword());
            return this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDTO.getUsername(), userDTO.getPassword(), authorities));
        } catch (IOException e) {
            throw new SecurityException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain chain, Authentication authResult) {
        String username = ((User) authResult.getPrincipal()).getUsername();
        Collection<GrantedAuthority> grantedAuthorities = ((User) authResult.getPrincipal()).getAuthorities();

        String token = Jwts
                .builder()
                .setSubject(username)
                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();

        log.info("Operation: {} status: {}", "generated jwt token", "successful authentication");
        response.addHeader(JWT_HEADER, JWT_PREFIX + token);
    }
}
