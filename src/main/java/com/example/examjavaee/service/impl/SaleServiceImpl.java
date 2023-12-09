package com.example.practical_exam.service.impl;

import com.example.practical_exam.entity.ProductEntity;
import com.example.practical_exam.entity.SaleEntity;
import com.example.practical_exam.repository.ProductRepository;
import com.example.practical_exam.repository.SaleRepository;
import com.example.practical_exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<SaleEntity> getAllSale() {
        return saleRepository.findAll();
    }

    @Override
    public SaleEntity getSaleId(Long saleId) {
        Optional<SaleEntity> product = saleRepository.findById(saleId);
        return product.orElseGet(SaleEntity::new);
    }
}
