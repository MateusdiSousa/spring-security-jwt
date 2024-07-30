package br.com.mateus.spring_security_jwt.Product.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mateus.spring_security_jwt.Product.domain.Product;
import br.com.mateus.spring_security_jwt.Product.domain.ProductDto;
import br.com.mateus.spring_security_jwt.Product.domain.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<Product> saveProduct(ProductDto dto) {
        Product product = new Product(dto);
        this.productRepository.save(product);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> listProducts = this.productRepository.findAll();
        return ResponseEntity.ok(listProducts);
    }
}