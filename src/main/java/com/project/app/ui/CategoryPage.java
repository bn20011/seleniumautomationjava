package com.project.app.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage extends Page {
    public static final String laptopCategoryXpath = "//a[contains(text(),'Laptops')]";
    public static final String phoneCategoryXpath = "//a[contains(text(),'Phones')]";
    public static final String monitorsCategoryXpath = "//a[contains(text(),'Monitors')]";
    public static final String nextButtonID = "next2";
    public static final String listGroupID = "list-group-item";
    public static final String classProducts = "col-lg-9";
    public static final String hrefName = "hrefch";
    public static final String productXpath = "(//a[contains(@href, 'prod.html?idp_=";
    public static final String endXpath = "')])";
    public static final String xPath = "//*[starts-with(@id, 'result_')]";

    public CategoryPage(String driverName){
        super(driverName);

    }

    public List<WebElement> getLaptopLinks(){
        WebElement e = findByXpath(laptopCategoryXpath);
        e.click(); // click Laptop Category
        List <WebElement> links = driver.findElements(By.className(hrefName));
        return links;
    }

    public List <WebElement> getPhoneLinks(WebDriver driver, String className){
        WebElement e = findByXpath(phoneCategoryXpath);
        e.click(); // click Phone Category
        List <WebElement> links = driver.findElements(By.className(className));
        return links;
    }

    public List <WebElement> getMonitorLinks(WebDriver driver, String className){
        WebElement e = findByXpath(monitorsCategoryXpath);
        e.click(); // click Phone Category
        List <WebElement> links = driver.findElements(By.className(className));
        return links;
    }
}
