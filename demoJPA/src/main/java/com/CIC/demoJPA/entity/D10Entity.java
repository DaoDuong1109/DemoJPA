package com.CIC.demoJPA.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.List;

@Entity //hibernate dùng để mapping xuống bảng trong DB
@Table(name = "D10")
public class D10Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "KB001", length = 8)
    private String KB001;//ngày báo cáo
    @Column(name = "KB002", length = 30)
    private String KB002;//Họ tên

    @Column(name = "KB003", length = 10)
    private String KB003;//số điện thoại

    @Column(name = "KB004", length = 30)
    private String KB004;//Email

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getKB001() {
        return KB001;
    }

    public void setKB001(String KB001) {
        this.KB001 = KB001;
    }

    public String getKB002() {
        return KB002;
    }

    public void setKB002(String KB002) {
        this.KB002 = KB002;
    }

    public String getKB003() {
        return KB003;
    }

    public void setKB003(String KB003) {
        this.KB003 = KB003;
    }

    public String getKB004() {
        return KB004;
    }

    public void setKB004(String KB004) {
        this.KB004 = KB004;
    }

    public List<D10_ToChucEntity> getD10_ToChucs() {
        return D10_ToChucs;
    }

    public void setD10_ToChucs(List<D10_ToChucEntity> d10_ToChucs) {
        D10_ToChucs = d10_ToChucs;
    }

    public List<D10_CaNhanEntity> getD10_CaNhans() {
        return D10_CaNhans;
    }

    public void setD10_CaNhans(List<D10_CaNhanEntity> d10_CaNhans) {
        D10_CaNhans = d10_CaNhans;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "D10Id", referencedColumnName = "ID")
    private List<D10_ToChucEntity> D10_ToChucs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "D10Id", referencedColumnName = "ID")
    private List<D10_CaNhanEntity> D10_CaNhans;
}
