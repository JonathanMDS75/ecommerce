package com.senai.ecommerce.controllers;

import com.senai.ecommerce.dtos.OrderDTO;
import com.senai.ecommerce.entities.;
import com.senai.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s") //localhost:8080/capi/
 public class Controller{
    @Autowired
    private OrderService OrderService;
    @GetMapping
    public ResponseEntity<List<OrderDTO>> getAllOrder() {
        List<OrderDTO> list = OrderService.findAll();
        return ResponseEntity.ok(list);
    }
}