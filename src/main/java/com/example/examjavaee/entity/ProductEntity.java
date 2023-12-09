package com.example.exam-javaee

.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long prodId;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "description")
    private String description;

    @Column(name = "date_of_manf")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfManf;

    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    List<SaleEntity> sales;
}
