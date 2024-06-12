package org.example.projektisi.controllers;

import org.example.projektisi.entity.Product;
import org.example.projektisi.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @GetMapping("/imie")
    public String imie() {
        return "Dominik Waśniewski";
    }
}
