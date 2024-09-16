package com.example.emloyeemanage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Tự động sinh getter, setter, toString, equals, và hashCode
@NoArgsConstructor // Tạo constructor không tham số
@AllArgsConstructor // Tạo constructor với tất cả các tham số
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
}