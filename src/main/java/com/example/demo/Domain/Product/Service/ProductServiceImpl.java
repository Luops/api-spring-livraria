package com.example.demo.Domain.Product.Service;

import com.example.demo.Domain.Product.Model.ProductModel;
import com.example.demo.Domain.Product.Repository.ProcuctRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProcuctRepository procuctRepository;

    @Override
    public ProductModel save(ProductModel productModel){
        return procuctRepository.save(productModel);
    }

    @Override
    public List<ProductModel> findAll(){
        return procuctRepository.findAll();
    }

    @Override
    public Optional<ProductModel> findById(Long id){
        return procuctRepository.findById(id);
    }

    @Override
    public ProductModel update(ProductModel productModel){
        return procuctRepository.save(productModel);
    }

    @Override
    public void deleteById(Long id){
        procuctRepository.deleteById(id);
    }
}
