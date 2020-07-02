package com.project.app.ui;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class Page {
    public static final String HOME_URL = "https://www.demoblaze.com/index.html";
    WebDriver driver;

    public Page(){}

    public Page(String driverName){
        this.driver = new Driver().getDriver(driverName) ;
    }

    public void loadPage(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize(); // maximaze the window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void hitEnter() throws AWTException{
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public WebElement findByXpath(String strValue){
        wait(5);
        WebElement element = driver.findElement(By.xpath(strValue));
        return element;
    }

    public WebElement findByClass(String strValue){
        wait(5);
        WebElement element = driver.findElement(By.className(strValue));
        return element;
    }

    public WebElement findByID(String strValue){
        wait(10);
        WebElement element = driver.findElement(By.id(strValue));
        return element;
    }

    public WebElement findByCssSelector(String strValue){
        wait(10);
        WebElement element = driver.findElement(By.cssSelector(strValue));
        return element;
    }

    public boolean validateElement(WebElement e){
        return e.isDisplayed();
    }



    public void javaScriptClick(WebElement element){
        wait(10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        wait(10);
    }

    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
