package com.example.flyway_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_tbl")
public class Product {

    @Id
    @GeneratedValue

    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="quantity")
    private int quantity;

    @Column(name ="price")
    private double price;

}
