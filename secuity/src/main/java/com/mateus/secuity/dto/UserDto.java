package com.mateus.secuity.dto;

import com.mateus.secuity.model.Role;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record UserDto(
    String firstName,
    String lastName,
    String username,
    String password,
    Role role
) {}
