package com.project.app.ui;

import org.openqa.selenium.WebDriver;

public class ProductPage extends Page{

    public static String eAddCartXpath = "//div[@id='tbodyid']/div[2]/div/a";
    public static String eAddCartXpath2 = "//a[contains(text(),'Add to cart')]";
    public static String eAddCartClass = ".btn.btn-success.btn-lg";
    public static String urlProduct = "https://www.demoblaze.com/prod.html?idp_=10";

    public ProductPage(String driverName){
        super(driverName);
    }
}
