package com.invman.InvrntoryManagementSystem.entity;

import com.invman.InvrntoryManagementSystem.enums.TransactionType;
import com.invman.InvrntoryManagementSystem.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    @NotBlank(message ="name is required")
    private String name ;
    @NotBlank(message ="Email is required")
    @Column(unique = true)
    private String email ;
    @NotBlank(message ="Password is required")
    private String password ;
    @NotBlank(message ="Phone Number is required")
    @Column(name = "phonenumbers_of_users")
    private String phoneNumber ;
    @Enumerated(EnumType.STRING)
    private UserRole role ;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transaction ;
    @Column(name = "createdAt")
    private final LocalDateTime createdAt = LocalDateTime.now() ;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                ", createdAt=" + createdAt +
                '}';
    }
}

