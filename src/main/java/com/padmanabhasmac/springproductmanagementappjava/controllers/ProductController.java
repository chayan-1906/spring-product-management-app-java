package com.padmanabhasmac.springproductmanagementappjava.controllers;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;
import com.padmanabhasmac.springproductmanagementappjava.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/getProduct")
    public ResponseEntity<?> getProductById(@RequestParam UUID id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @PutMapping("/updateProduct")
    public ResponseEntity<?> updateProduct(@RequestParam UUID id, @RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProductById(id, product), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @DeleteMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestParam UUID id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>("Product with id " + id + " deleted successfully", HttpStatus.OK);
    }
}
