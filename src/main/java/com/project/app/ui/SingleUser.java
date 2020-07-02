package com.project.app.ui;

import java.util.Date;

public class SingleUser {
    private String timestamp;
    private String username;
    private String password;
    private String email;

    private static SingleUser user = new SingleUser();

    private SingleUser(){
        setUserData();
    }

    public static SingleUser getUser(){
        return user;
    }

    public String getTimestamp(){ return timestamp; }
    public String getUserName(){ return username; }
    public String getPassword(){ return password; }
    public String getEmail(){ return email; }

    private  void setUser(String user){ this.username = user + timestamp; }
    private void setPassword(String password){ this.password = "pass" + timestamp; }
    private void setEmail(String email){ this.email = "email" + timestamp + "@gmail.com"; }

    private void setUserData(){
        setTimestamp();
        setUser("user");
        setEmail("email");
        setPassword("pass");

    }

    private void setTimestamp(){
        Date date = new Date();
        long time = date.getTime();
        String s = Long.toString(time);
        this.timestamp = Long.toString(time);
    }
}
