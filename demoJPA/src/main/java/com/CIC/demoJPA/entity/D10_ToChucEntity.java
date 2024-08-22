package com.CIC.demoJPA.entity;

import jakarta.persistence.*;

import java.util.List;

@jakarta.persistence.Entity
@Table(name = "D10_TOCHUC")
public class D10_ToChucEntity {
    @Id
    @Column(name = "TTC03")
    private String TTC03;

    @Column(name = "TTC04")
    private String TTC04;
    @Column(name = "TC001")
    private String TC001;
    @Column(name = "TC002")
    private String TC002;
    @Column(name = "TC003")
    private String TC003;
    @Column(name = "TC004")
    private String TC004;
    @Column(name = "TC005")
    private String TC005;
    @Column(name = "TC006")
    private double TC006;
    @Column(name = "TC007")
    private String TC007;
    @Column(name = "TC008")
    private String TC008;
    @Column(name = "TC009")
    private String TC009;
    @Column(name = "TC010")
    private String TC010;
    @Column(name = "TC011")
    private String TC011;
    @Column(name = "TC012")
    private String TC012;
    @Column(name = "TC013")
    private String TC013;
    @Column(name = "TC014")
    private String TC014;
    @Column(name = "TC015")
    private String TC015;
    @Column(name = "TC016")
    private String TC016;
    @Column(name = "TC017")
    private String TC017;
    @Column(name = "TC018")
    private String TC018;
    @Column(name = "TC019")
    private String TC019;
    @Column(name = "TC020")
    private String TC020;
    @Column(name = "TC021")
    private String TC021;
    @Column(name = "TC022")
    private double TC022;
    @Column(name = "TC023")
    private double TC023;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "D10_ToChuc_ID", referencedColumnName = "TTC03")
    private List<D10_ToChuc_TC024Entity> D10_ToChuc_TC024s;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "D10_ToChuc_ID", referencedColumnName = "TTC03")
    private List<D10_ToChuc_TC025Entity> D10_ToChuc_TC025s;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "D10_ToChuc_ID", referencedColumnName = "TTC03")
    private List<D10_ToChuc_TC026Entity> D10_ToChuc_TC026s;

    public String getTTC03() {
        return TTC03;
    }

    public void setTTC03(String TTC03) {
        this.TTC03 = TTC03;
    }

    public String getTTC04() {
        return TTC04;
    }

    public void setTTC04(String TTC04) {
        this.TTC04 = TTC04;
    }

    public String getTC001() {
        return TC001;
    }

    public void setTC001(String TC001) {
        this.TC001 = TC001;
    }

    public String getTC002() {
        return TC002;
    }

    public void setTC002(String TC002) {
        this.TC002 = TC002;
    }

    public String getTC003() {
        return TC003;
    }

    public void setTC003(String TC003) {
        this.TC003 = TC003;
    }

    public String getTC004() {
        return TC004;
    }

    public void setTC004(String TC004) {
        this.TC004 = TC004;
    }

    public String getTC005() {
        return TC005;
    }

    public void setTC005(String TC005) {
        this.TC005 = TC005;
    }

    public double getTC006() {
        return TC006;
    }

    public void setTC006(double TC006) {
        this.TC006 = TC006;
    }

    public String getTC007() {
        return TC007;
    }

    public void setTC007(String TC007) {
        this.TC007 = TC007;
    }

    public String getTC008() {
        return TC008;
    }

    public void setTC008(String TC008) {
        this.TC008 = TC008;
    }

    public String getTC009() {
        return TC009;
    }

    public void setTC009(String TC009) {
        this.TC009 = TC009;
    }

    public String getTC010() {
        return TC010;
    }

    public void setTC010(String TC010) {
        this.TC010 = TC010;
    }

    public String getTC011() {
        return TC011;
    }

    public void setTC011(String TC011) {
        this.TC011 = TC011;
    }

    public String getTC012() {
        return TC012;
    }

    public void setTC012(String TC012) {
        this.TC012 = TC012;
    }

    public String getTC013() {
        return TC013;
    }

    public void setTC013(String TC013) {
        this.TC013 = TC013;
    }

    public String getTC014() {
        return TC014;
    }

    public void setTC014(String TC014) {
        this.TC014 = TC014;
    }

    public String getTC015() {
        return TC015;
    }

    public void setTC015(String TC015) {
        this.TC015 = TC015;
    }

    public String getTC016() {
        return TC016;
    }

    public void setTC016(String TC016) {
        this.TC016 = TC016;
    }

    public String getTC017() {
        return TC017;
    }

    public void setTC017(String TC017) {
        this.TC017 = TC017;
    }

    public String getTC018() {
        return TC018;
    }

    public void setTC018(String TC018) {
        this.TC018 = TC018;
    }

    public String getTC019() {
        return TC019;
    }

    public void setTC019(String TC019) {
        this.TC019 = TC019;
    }

    public String getTC020() {
        return TC020;
    }

    public void setTC020(String TC020) {
        this.TC020 = TC020;
    }

    public String getTC021() {
        return TC021;
    }

    public void setTC021(String TC021) {
        this.TC021 = TC021;
    }

    public double getTC022() {
        return TC022;
    }

    public void setTC022(double TC022) {
        this.TC022 = TC022;
    }

    public double getTC023() {
        return TC023;
    }

    public void setTC023(double TC023) {
        this.TC023 = TC023;
    }

    public List<D10_ToChuc_TC024Entity> getD10_ToChuc_TC024s() {
        return D10_ToChuc_TC024s;
    }

    public void setD10_ToChuc_TC024s(List<D10_ToChuc_TC024Entity> d10_ToChuc_TC024s) {
        D10_ToChuc_TC024s = d10_ToChuc_TC024s;
    }

    public List<D10_ToChuc_TC025Entity> getD10_ToChuc_TC025s() {
        return D10_ToChuc_TC025s;
    }

    public void setD10_ToChuc_TC025s(List<D10_ToChuc_TC025Entity> d10_ToChuc_TC025s) {
        D10_ToChuc_TC025s = d10_ToChuc_TC025s;
    }

    public List<D10_ToChuc_TC026Entity> getD10_ToChuc_TC026s() {
        return D10_ToChuc_TC026s;
    }

    public void setD10_ToChuc_TC026s(List<D10_ToChuc_TC026Entity> d10_ToChuc_TC026s) {
        D10_ToChuc_TC026s = d10_ToChuc_TC026s;
    }
}
