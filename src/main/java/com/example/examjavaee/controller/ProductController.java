package com.example.exam-javaee.controller;

import com.example.exam-javaee

.entity.ProductEntity;
import com.example.exam-javaee

.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String getFormCreate(ModelMap modelMap) {
        String view = "listProduct";
        try {
            List<ProductEntity> products = productService.getAllProduct();
            modelMap.addAttribute("products", products);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;

    }
}
