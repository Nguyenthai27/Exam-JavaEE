package com.example.practical_exam.service;

import com.example.practical_exam.entity.ProductEntity;
import com.example.practical_exam.entity.SaleEntity;

import java.util.List;

public interface SaleService {
    List<SaleEntity> getAllSale();
    SaleEntity getSaleId(Long saleId);
}
