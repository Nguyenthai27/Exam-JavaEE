package com.example.exam-javaee

.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sale")
@NoArgsConstructor
@AllArgsConstructor
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sl_no")
    private Integer slNo;

    @Column(name = "salesman_id")
    private Long salesmanId;

    @Column(name = "salesman_name")
    private String salesmanName;

    @Column(name = "dos")
    private Integer dos;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    @JsonIgnore
    private ProductEntity product;
}
