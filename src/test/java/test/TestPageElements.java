package test;
import com.project.app.ui.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class TestPageElements {
    private Page page;
    private WebDriver driver;


    public void validateAddCartClassName(){
        page.loadPage(driver, ProductPage.urlProduct);
        WebElement eAddCartCssLocator = page.findByClass(ProductPage.eAddCartClass);
        boolean value = eAddCartCssLocator.isDisplayed();
        assertEquals(true, value);
        System.out.println("eAddCartCssLocator: " + value);
    }

    public void validateAddCartXpath2(){
        page.loadPage(driver, ProductPage.urlProduct);
        WebElement eAddCartXpath2 = page.findByXpath (ProductPage.eAddCartXpath2);
        boolean value = eAddCartXpath2.isDisplayed();
        assertEquals(true, value);
        System.out.println("eAddCartXpath2: " + value);
    }

    public void validateLaptopCategoryXpath(){
        WebElement laptopCategoryXpath = page.findByXpath(CategoryPage.laptopCategoryXpath);
        boolean value = laptopCategoryXpath.isDisplayed();
        assertEquals(true, value);
        System.out.println("laptopCategoryXpath: " + value);
    }

    public void validateNextButtonID(WebDriver driver, Page p){
        WebElement nextButtonID = p.findByID(CategoryPage.nextButtonID);
        boolean value = nextButtonID.isDisplayed();
        assertEquals(true, value);
        System.out.println("nextButtonID: " + value);
    }

    public void validatePhoneCategoryXpath(){
        WebElement phoneCategoryXpath = page.findByXpath(CategoryPage.phoneCategoryXpath);
        boolean value = phoneCategoryXpath.isDisplayed();
        assertEquals(true, value);
        System.out.println("phoneCategoryXpath: " + value);
    }

    //MonitorsCategoryXpath

    public void validateMonitorsCategoryXpath(){
        WebElement monitorsCategoryXpath = page.findByXpath(CategoryPage.monitorsCategoryXpath);
        boolean value = monitorsCategoryXpath.isDisplayed();
        assertEquals(true, value);
        System.out.println("monitorsCategoryXpath: " + value);
    }




}
