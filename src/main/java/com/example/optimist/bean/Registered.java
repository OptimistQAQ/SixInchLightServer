package com.example.optimist.bean;

/**
 * @author 65667
 */
public class Registered {

    private String name;
    private String password;

    private String profile;

    public Registered(String name, String password, String profile) {
        this.name = name;
        this.password = password;
        this.profile = profile;
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
                ", profile='" + profile + '\'' +
                '}';
    }
}
