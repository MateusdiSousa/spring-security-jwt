package br.com.mateus.spring_security_jwt.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.spring_security_jwt.Product.domain.Product;
import br.com.mateus.spring_security_jwt.Product.domain.ProductDto;
import br.com.mateus.spring_security_jwt.Product.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto bodyDto){
        return this.productService.saveProduct(bodyDto);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        return this.productService.getAllProducts();
    }
}
