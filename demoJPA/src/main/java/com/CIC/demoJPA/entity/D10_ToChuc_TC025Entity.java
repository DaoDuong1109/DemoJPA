package com.CIC.demoJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TC025")
public class D10_ToChuc_TC025Entity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TC0251")
    private String TC0251;
    @Column(name = "TC0252")
    private String TC0252;
    @Column(name = "TC0253")
    private String TC0253;
}
