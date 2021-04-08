package br.health.workflow.config.security.dto;

import lombok.*;

@Data
public class UserDTO {

    private String username;
    private String password;
    private String profile;

}