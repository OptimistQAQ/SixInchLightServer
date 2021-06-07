package com.example.optimist.entity;

/**
 * @author 65667
 */
public class Admin {
    private Integer ano;

    private String utitle;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getUtitle() {
        return utitle;
    }

    public void setUtitle(String utitle) {
        this.utitle = utitle == null ? null : utitle.trim();
    }
}