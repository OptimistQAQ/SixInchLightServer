package com.example.optimist.entity;

/**
 * @author 65667
 */
public class Flower {
    private Integer fno;

    private String fname;

    private String fintroduce;

    private String fvalue;

    private String fpart;

    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFintroduce() {
        return fintroduce;
    }

    public void setFintroduce(String fintroduce) {
        this.fintroduce = fintroduce == null ? null : fintroduce.trim();
    }

    public String getFvalue() {
        return fvalue;
    }

    public void setFvalue(String fvalue) {
        this.fvalue = fvalue == null ? null : fvalue.trim();
    }

    public String getFpart() {
        return fpart;
    }

    public void setFpart(String fpart) {
        this.fpart = fpart == null ? null : fpart.trim();
    }
}