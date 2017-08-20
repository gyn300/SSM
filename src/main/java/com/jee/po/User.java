package com.jee.po;

/**
 * Created by Administrator on 2017/8/16.
 */
public class User {
    private int id;
    private String user_name;
    private String user_pwd;

    public User(int id, String user_name, String user_pwd) {
        this.id = id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public User(String user_name, String user_pwd) {
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }
}
