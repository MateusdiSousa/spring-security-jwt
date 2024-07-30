package br.com.mateus.spring_security_jwt.Product.domain;

public record ProductDto(
    String id,
    String name,
    int stock,
    Float price
) {}
