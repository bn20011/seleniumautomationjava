package com.project.app.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    WebDriver driver;

    public WebDriver getDriver(){
    return driver;
    }

    public WebDriver getDriver(String strDriver){
        if(strDriver ==null){
            return null;
        }
        if(strDriver.equalsIgnoreCase("Chrome")){
            setDriverChrome();
            return getDriver();
        }
        else if(strDriver.equalsIgnoreCase("Firefox")){
            setDriverFirefox();
            return getDriver();
        }
        else if(strDriver.equalsIgnoreCase("Opera")){
            setDriverOpera();
            return getDriver();
        }
        else if(strDriver.equalsIgnoreCase("Saphari")){
            setDriverSaphari();
            return getDriver();
        }
         return null;
    }


    private void setDriverChrome(){ this.driver = new ChromeDriver(); }
    private void setDriverFirefox(){ this.driver = new FirefoxDriver(); }
    private void setDriverOpera(){ this.driver = new OperaDriver(); }
    private void setDriverSaphari(){ this.driver = new SafariDriver(); }

    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static WebDriver runChrome(){
        WebDriver driverChrome = new ChromeDriver();
        return driverChrome;
    }

    public static WebDriver runFirefox(){
        WebDriver firefoxDriver = new FirefoxDriver();
        return firefoxDriver;
    }

}
