package br.com.mateus.spring_security_jwt.Product.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {}
