package com.example.optimist.bean;

/**
 * @author 65667
 */
public class Registered {

    private String name;
    private String password;
    private String nick_name;

    private String profile;

    public Registered(String name, String password, String nick_name, String profile) {
        this.name = name;
        this.password = password;
        this.nick_name = nick_name;
        this.profile = profile;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Registered{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
