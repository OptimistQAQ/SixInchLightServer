package com.example.optimist.entity;

/**
 * @author 65667
 */
public class Attention {
    private Integer ano;

    private Integer fno;

    private String aintroduce;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    public String getAintroduce() {
        return aintroduce;
    }

    public void setAintroduce(String aintroduce) {
        this.aintroduce = aintroduce == null ? null : aintroduce.trim();
    }
}