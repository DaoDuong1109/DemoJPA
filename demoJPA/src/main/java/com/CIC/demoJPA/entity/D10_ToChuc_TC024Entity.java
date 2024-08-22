package com.CIC.demoJPA.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name = "TC024")
public class D10_ToChuc_TC024Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "TC0241")
    private String TC0241;
    @Column(name = "TC0242")
    private double TC0242;
}
