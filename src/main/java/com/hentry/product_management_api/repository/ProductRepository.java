package com.hentry.product_management_api.repository;


import com.hentry.product_management_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
