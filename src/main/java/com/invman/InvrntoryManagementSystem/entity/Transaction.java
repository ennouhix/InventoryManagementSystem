package com.invman.InvrntoryManagementSystem.entity;


import com.invman.InvrntoryManagementSystem.enums.TransactionStatus;
import com.invman.InvrntoryManagementSystem.enums.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="transactions")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private Integer totalProducts ;


    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType ;

    @Enumerated(EnumType.STRING)

    private TransactionStatus status ;

    private String description ;

    private LocalDateTime updatedAt ;

    private final LocalDateTime createdAT = LocalDateTime.now() ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier ;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", totalProducts=" + totalProducts +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", transactionType=" + transactionType +
                ", description='" + description + '\'' +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}