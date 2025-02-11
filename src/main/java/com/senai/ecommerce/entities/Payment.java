package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Set;

@Data
@Entity
@Table(name = "tb_payment")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

   @OneToOne
   @MapsId
   private Order order;



}
