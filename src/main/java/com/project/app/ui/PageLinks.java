package com.project.app.ui;
import file.CreateFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class PageLinks extends Page {
    List <WebElement> linkList;

public PageLinks(String driverName){
    super(driverName);
}

    public List <WebElement> getWebLinksByTag(WebDriver driver){
        linkList = driver.findElements(By.tagName("a"));
        return linkList;
    }

    public List <WebElement> getWebLinksByClass(WebDriver driver, String className){
        linkList = driver.findElements(By.className(className));
        return linkList;
    }

    public List <WebElement> getWebLinksByCssSelector(WebDriver driver, String className){
        linkList = driver.findElements(By.cssSelector(className));
        return linkList;
    }

    public static void getLinksDiv(String url, String divClass, WebDriver driver){
        for(int idx = 1; idx <= 20; idx++) {
            driver.findElement(By.xpath("//a[@href='/edit-files.php?i=" + idx + "']")).click();
        }
    }

    public List <WebElement> getLinksByCategory(String categoryXpath, String className){
        WebElement e = findByXpath(categoryXpath);
        e.click();
        List <WebElement> categoryElements = driver.findElements(By.className(className));
        return categoryElements;
    }


    public void printLinks(){
        for(WebElement link: linkList){
            System.out.println(link.getText() + ": " + link.getAttribute("href"));
        }
    }

    public void printLinkName(){
        for(WebElement link: linkList){
            System.out.println(link.getAttribute("href"));
        }
    }

    public void printToFileLinks(){
        CreateFile file = new CreateFile();
        file.createFile();
        file.writeList(linkList, file.getFileFullPath());
    }

}
