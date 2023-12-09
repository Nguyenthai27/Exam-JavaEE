package com.example.practical_exam.service.impl;

import com.example.practical_exam.entity.ProductEntity;
import com.example.practical_exam.repository.ProductRepository;
import com.example.practical_exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(Long prodId) {
        Optional<ProductEntity> product = productRepository.findById(prodId);
        return product.orElseGet(ProductEntity::new);
    }
}
