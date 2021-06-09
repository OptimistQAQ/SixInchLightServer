package com.example.optimist.bean;

/**
 * @author 65667
 */
public class UserUpdate {

    private Integer uno;
    private String name;
    private String nick_name;
    private String password;

    public UserUpdate(Integer uno, String name, String nick_name, String password) {
        this.uno = uno;
        this.name = name;
        this.nick_name = nick_name;
        this.password = password;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserUpdate{" +
                "uno=" + uno +
                ", name='" + name + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
