package com.mateus.secuity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationResponse {
    private String token;

    public AuthenticationResponse(String token){
        this.token = token;
    }
}
