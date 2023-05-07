package com.padmanabhasmac.springproductmanagementappjava.services;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;

import java.util.List;
import java.util.UUID;

public interface IProductService {

    List<Product> getAllProducts();

    Product addProduct(Product product);

    Product getProductById(UUID id);

    Product updateProductById(UUID id, Product product);

    void deleteProductById(UUID id);
}
