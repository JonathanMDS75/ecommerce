package com.senai.ecommerce.controllers;

import com.senai.ecommerce.dtos.CategoryDTO;
import com.senai.ecommerce.entities.Category;
import com.senai.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories") //localhost:8080/capi/category
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory() {
        List<CategoryDTO> list = categoryService.findAll();
        return ResponseEntity.ok(list);
    }
}
