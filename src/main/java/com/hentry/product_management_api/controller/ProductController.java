package com.hentry.product_management_api.controller;

import com.hentry.product_management_api.entity.Product;
import com.hentry.product_management_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product>getAllProducts(){
        return service.getAllProducts();
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
    @PutMapping
    public Product updateproduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return "Product Deleted Successfully";
    }

}
