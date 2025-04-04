package com.example.demo.Domain.Product.Repository;

import com.example.demo.Domain.Product.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcuctRepository extends JpaRepository<ProductModel, Long> {
}
