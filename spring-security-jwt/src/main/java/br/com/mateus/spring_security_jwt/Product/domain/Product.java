package br.com.mateus.spring_security_jwt.Product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "product")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private int stock;

    private Float price;

    public Product(ProductDto dto){
        if (dto.id() != null) {
            this.id = dto.id();
        }
        this.name = dto.name();
        this.price = dto.price();
        this.stock = dto.stock();
    }
}
