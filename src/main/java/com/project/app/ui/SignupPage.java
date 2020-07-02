package com.project.app.ui;
import org.openqa.selenium.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
// Test Signup Page

public class SignupPage extends Page{
    public static final String strSignupWindowID = "signin2";
    public static final String strSignupWindowXPath = "";
    public static final String strSignupUsernameBoxID = "sign-username";
    public static final String strSignupPasswordBoxID ="sign-password";
    public static final String strSignupButtonIDClass = "//div[2]/div/div/div[3]/button[2]";
    WebElement signupWindow;
    WebElement signupUsernameBox;
    WebElement signupPasswordBox;
    WebElement signupButton;

    public SignupPage(String driverName){
        super(driverName);
        clickSignupLink();
        setSingupElements();

    }

    public void setSingupElements(){

        setSignupUsernameBoxID();
        setSignupPasswordBoxID();
        setSignupButtonIDClass();

    }

    public void setSignupWindowID(){ signupWindow= super.findByID(strSignupWindowID); }

    public void setSignupUsernameBoxID(){ signupUsernameBox= super.findByID(strSignupUsernameBoxID); }

    public void setSignupPasswordBoxID(){ signupPasswordBox= super.findByID(strSignupPasswordBoxID); }

    public void setSignupButtonIDClass(){ signupButton= super.findByXpath(strSignupButtonIDClass); }

    public WebElement getSignupWindow(){ return signupWindow; }

    public WebElement getSignupUsernameBox(){ return signupUsernameBox; }

    public WebElement getSignupPasswordBox(){ return signupPasswordBox; }

    public WebElement getSignupButton(){ return signupButton; }

    private void clickSignupLink(){
        loadPage(driver, Page.HOME_URL);
        setSignupWindowID();
        signupWindow.click();
    }



    public void signup(String user, String password){

       // signupUsernameBox = getSignupUsernameBoxID();
        signupUsernameBox.sendKeys(user);

       // signupPasswordBox = getSignupPasswordBoxID();
        signupPasswordBox.sendKeys(password);

      //  signupButton = getSignupButtonIDClass();
        super.javaScriptClick(signupButton);
        try {
            hitEnter();
        } catch (AWTException e) {
            System.out.println(e.getMessage());
        }
    }





    }

