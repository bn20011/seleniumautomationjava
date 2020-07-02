package com.project.app.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Page {
    //LoginPage elements
    public static final String strLoginLinkID = "login2";
    public static final String strLoginButtonID = "//div[3]/div/div/div[3]/button[2]";
    public static final String strUserBoxID = "loginusername";
    public static final String strPassBoxID = "loginpassword";
    public static final String strConfirmationID = "nameofuser";
    public String confirmationLoginMsg;
    public WebElement loginLink;
    public WebElement loginButton;
    public WebElement userBox;
    public WebElement passBox;
    public WebElement loginConfirmation;

    public LoginPage(String driverName){
         super(driverName);
         clickLogin();
         setLoginElements();

    }

    private void setLoginElements(){
        setUserBox();
        setPassBox();
        setLoginButton();
    }
    private void setLoginConfirmationMsg(){
        wait(10);
        confirmationLoginMsg = getConfirmation().getText();
     }

    public String getLoginConfirmationMsg(){
        return confirmationLoginMsg;
    }

    private void setLoginLink(){
        loginLink = super.findByID(strLoginLinkID);
    }
    private void setUserBox(){
        userBox= super.findByID(strUserBoxID);
    }

    private void setPassBox(){
        passBox= super.findByID(strPassBoxID);
    }
    private void setLoginButton(){
        loginButton= super.findByXpath(strLoginButtonID);
    }

    public WebElement getLoginLink(){
        return loginLink;
    }
    public WebElement getLoginButton(){
        return loginButton;
    }
    public WebElement getUserBox(){
        return userBox;
    }
    public WebElement getPassBox(){
        return passBox;
    }
    public WebElement getConfirmation(){
        return loginConfirmation;
    }
    private void setConfirmation(){
        loginConfirmation= super.findByID(strConfirmationID);
       }

private void clickLogin(){
    loadPage(driver, Page.HOME_URL);
    setLoginLink();
    loginLink.click();
}
    public void login(String user, String password){
        userBox.sendKeys(user); // enter user field
        passBox.sendKeys(password);// enter user field
        super.javaScriptClick(loginButton);
        try {
            Page.hitEnter();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        setConfirmation();
        System.out.println(getLoginConfirmationMsg());
    }
}



