package com.example.examjavaee.controller;

import com.example.exam-javaee

.entity.ProductEntity;
import com.example.exam-javaee

.entity.SaleEntity;
import com.example.exam-javaee

.service.ProductService;
import com.example.exam-javaee

.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/list")
    public String getFormCreate(ModelMap modelMap) {
        String view = "listSale";
        try {
            List<SaleEntity> sales = saleService.getAllSale();
            modelMap.addAttribute("sales", sales);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;

    }
}
