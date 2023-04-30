package com.padmanabhasmac.springproductmanagementappjava.controllers;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;
import com.padmanabhasmac.springproductmanagementappjava.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getAll")
    public ResponseEntity<?> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        Product createdProduct = productService.addProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }
}
