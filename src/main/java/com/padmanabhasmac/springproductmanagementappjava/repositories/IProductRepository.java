package com.padmanabhasmac.springproductmanagementappjava.repositories;

import com.padmanabhasmac.springproductmanagementappjava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProductRepository extends JpaRepository<Product, UUID> {
}
