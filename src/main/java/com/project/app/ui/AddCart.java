package com.project.app.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.*;
import java.util.List;

public class AddCart extends Page{
    public static final String eAddCartXpath2 = "";
    WebDriver driver;

    WebElement eAddCartButton;

    public AddCart(String driverName){
        super(driverName);
    }

   public void addToCart(List<WebElement> list){

       for(WebElement link: list){
           String linkName = link.getAttribute("href");

           super.loadPage(driver, linkName);
           WebElement eAddCartButton = super.findByXpath(eAddCartXpath2);
           javaScriptClick(eAddCartButton);
           try {
               super.hitEnter();
           } catch (AWTException e) {
               e.printStackTrace();
           }
       }

   }



   public List<WebElement> getCategoryList(WebDriver driver){
       List<WebElement> resultsList = driver.findElements(By.xpath(".//*[starts-with(@id, 'result_')]"));
   return resultsList;
    }
}
