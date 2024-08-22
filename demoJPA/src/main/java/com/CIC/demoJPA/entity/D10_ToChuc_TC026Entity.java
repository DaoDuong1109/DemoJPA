package com.CIC.demoJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TC026")
public class D10_ToChuc_TC026Entity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TC0261")
    private String TC0261;
    @Column(name = "TC0262")
    private String TC0262;
    @Column(name = "TC0263")
    private String TC0263;
}
