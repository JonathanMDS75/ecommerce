package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "tb_user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String birthDate;
    private String roles;

    @ManyToMany(mappedBy = "users")
    private Set<Order> orders;
}
