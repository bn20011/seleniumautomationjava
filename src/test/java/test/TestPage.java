
package test;

import com.project.app.ui.Page;
import org.openqa.selenium.WebElement;

public class TestPage {


    public static void testRun(){

    }

    public static void testLinkClick(){
        String xPath = "//a[contains(text(),'Laptops')]";
        Page p = new Page();
        WebElement e = p.findByXpath(xPath);
        e.click();
        System.out.println(e.getText());
    }
}

