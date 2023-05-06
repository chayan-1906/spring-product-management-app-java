package com.padmanabhasmac.springproductmanagementappjava.services;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;
import com.padmanabhasmac.springproductmanagementappjava.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface IProductService {

    List<Product> getAllProducts();

    Product addProduct(Product product);

    Product getProductById(UUID id);

    Product updateProduct(UUID id, Product product);
}
