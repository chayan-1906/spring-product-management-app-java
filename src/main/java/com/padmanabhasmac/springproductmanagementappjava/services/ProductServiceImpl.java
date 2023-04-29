package com.padmanabhasmac.springproductmanagementappjava.services;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;
import com.padmanabhasmac.springproductmanagementappjava.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * @param product
     * @return
     */
    @Override
    public Product addProduct(Product product) {
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }
}
