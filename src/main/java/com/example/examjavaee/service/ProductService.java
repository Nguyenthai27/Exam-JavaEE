package com.example.practical_exam.service;

import com.example.practical_exam.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();
    ProductEntity getProductById(Long prodId);
}
