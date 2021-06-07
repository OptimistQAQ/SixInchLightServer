package com.example.optimist.entity;

/**
 * @author 65667
 */
public class Flowerinformation {
    private Integer ino;

    private String iname;

    private String imessage;

    private String iphoto;

    public Integer getIno() {
        return ino;
    }

    public void setIno(Integer ino) {
        this.ino = ino;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getImessage() {
        return imessage;
    }

    public void setImessage(String imessage) {
        this.imessage = imessage == null ? null : imessage.trim();
    }

    public String getIphoto() {
        return iphoto;
    }

    public void setIphoto(String iphoto) {
        this.iphoto = iphoto == null ? null : iphoto.trim();
    }
}