package com.mateus.secuity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mateus.secuity.dto.LoginDto;
import com.mateus.secuity.dto.UserDto;
import com.mateus.secuity.model.AuthenticationResponse;
import com.mateus.secuity.model.User;
import com.mateus.secuity.repository.UserRepository;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    @Autowired 
    private AuthenticationManager authenticationManager;

    public AuthenticationResponse register(UserDto dto ){
        User user = new User(dto);
        user.setPassword(passwordEncoder.encode(dto.password()));

        User response = userRepository.save(user);
        String token = jwtService.generateToken(user);

        return new AuthenticationResponse(token);
    }

    public AuthenticationResponse authenticate(LoginDto dto){
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(dto.username(), dto.password())
        );

        User user = userRepository.findByUsername(dto.username()).orElseThrow();
        String token = jwtService.generateToken(user);

        return new AuthenticationResponse(token);
    }
}
