package com.example.demo.Product.Repository;

import com.example.demo.Product.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcuctRepository extends JpaRepository<ProductModel, Long> {
}
