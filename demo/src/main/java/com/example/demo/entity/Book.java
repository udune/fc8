package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity // DDL
@Data
public class Book { // Book(Object) ---> ORM(Hibernate) : JPA ---> DB : book table 생성
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long id; // 1, 2, 3, 4,

    @Column(length = 50, nullable = false, unique = true)
    private String title; // COLUMN varchar(255), not null
    private int price;
    private String author; // authorName(DB)
    private int page;
}
