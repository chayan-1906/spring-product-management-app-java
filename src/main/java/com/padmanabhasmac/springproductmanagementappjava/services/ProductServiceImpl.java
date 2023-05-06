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

    /**
     * @return
     */
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

    /**
     * @param id
     * @return
     */
    @Override
    public Product getProductById(UUID id) {
        return productRepository.findById(id).get();
    }

    /**
     * param id
     * @param product
     * @return
     */
    @Override
    public Product updateProduct(UUID id, Product product) {
        Product productToBeUpdated = productRepository.findById(id).get();
        productToBeUpdated.setId(id);
        productToBeUpdated.setName(product.getName());
        productToBeUpdated.setPrice(product.getPrice());
        productToBeUpdated.setQuantity(product.getQuantity());
        productRepository.save(productToBeUpdated);
        return productToBeUpdated;
    }
}
