package com.senai.ecommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class OrderItemPk {
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
