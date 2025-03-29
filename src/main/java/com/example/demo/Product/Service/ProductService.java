package com.example.demo.Product.Service;

import com.example.demo.Product.Model.ProductModel;

import java.util.List;
import java.util.Optional;

// Crud do product
public interface ProductService {
    ProductModel save(ProductModel productModel);
    List<ProductModel> findAll();
    Optional<ProductModel> findById(Long id);
    ProductModel update(ProductModel productModel);
    void deleteById(Long id);
}
