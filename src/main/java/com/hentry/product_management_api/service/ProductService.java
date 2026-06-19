package com.hentry.product_management_api.service;

import com.hentry.product_management_api.entity.Product;
import com.hentry.product_management_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepository;

    public List<Product>getAllProducts(){
        return productrepository.findAll();
    }
    public Product addProduct(Product product){
        return productrepository.save(product);
    }
    public Product updateProduct(Product product){
        return productrepository.save(product);
    }
    public void deleteProduct(Long id){
         productrepository.deleteById(id);
    }
    public List<Product> searchProduct(String name){
        return productrepository.findByName(name);
    }
    public List<Product> getProductsByCategory(String category){
        return productrepository.findByCategory(category);
    }

}
