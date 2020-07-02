package com.project.app.ui;
import java.util.Date;

public class UserData {
    String timestamp;
    String username;
    String password;
    String email;

    public void setTimestamp(){
        Date date = new Date();
        long time = date.getTime();
        String s = Long.toString(time);
        this.timestamp = Long.toString(time);
    }
    public String getTimestamp(){ return timestamp; }
    public String getUser(){ return username; }
    public void setUser(String user){ this.username = user + timestamp; }
    public String getPassword(){ return password; }
    public void setPassword(String password){ this.password = "pass" + timestamp; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = "email" + timestamp + "@gmail.com"; }




    public UserData(){
        setTimestamp();
        setUser("user");
        setEmail("email");
        setPassword("pass");

    }
    @Override
    public String toString(){
        return  username + " " + password + " " + email + " " + timestamp;
    }

    public void printUserData(){
        System.out.println(toString());
    }

    public static void runTest(){
        UserData d = new UserData();
        d.printUserData();

    }

}
