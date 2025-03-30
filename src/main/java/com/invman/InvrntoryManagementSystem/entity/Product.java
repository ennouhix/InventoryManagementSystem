package com.invman.InvrntoryManagementSystem.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="products")


public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank(message = "name is required")
    @Column(unique = true)
    private String name ;

    @NotBlank(message = "sku is required")
    @Column(unique = true)
    private String sku ;
    @Positive(message = "price must be a positive value")
    private BigInteger price ;
    @Min(value = 0 , message = "Stock quantity cannot be lesser than 0 ")
    private Integer stockQuantiy;

    private String description ;
    private String imageUrl ;
    private LocalDateTime expiryDate;
    private LocalDateTime updateAt;
    private final LocalDateTime createdAt = LocalDateTime.now();
    @ManyToMany
    @JoinColumn(name = "category_id")
    private Category category ;

    @Override
    public String toString() {
        return "Product{" +
                "createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", expiryDate=" + expiryDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", stockQuantiy=" + stockQuantiy +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

