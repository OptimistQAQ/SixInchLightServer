package com.example.optimist.entity;

/**
 * @author 65667
 */
public class Newsflower {
    private Integer nno;

    private String ntitle;

    private String nathor;

    private String ntime;

    private String nimg;

    private String ndetail;

    public Integer getNno() {
        return nno;
    }

    public void setNno(Integer nno) {
        this.nno = nno;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public String getNathor() {
        return nathor;
    }

    public void setNathor(String nathor) {
        this.nathor = nathor == null ? null : nathor.trim();
    }

    public String getNtime() {
        return ntime;
    }

    public void setNtime(String ntime) {
        this.ntime = ntime == null ? null : ntime.trim();
    }

    public String getNimg() {
        return nimg;
    }

    public void setNimg(String nimg) {
        this.nimg = nimg == null ? null : nimg.trim();
    }

    public String getNdetail() {
        return ndetail;
    }

    public void setNdetail(String ndetail) {
        this.ndetail = ndetail == null ? null : ndetail.trim();
    }
}