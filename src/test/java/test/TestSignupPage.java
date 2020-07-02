package test;

import com.project.app.ui.*;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import java.awt.*;

import static org.junit.Assert.assertEquals;

public class TestSignupPage {
    SignupPage page;
    SingleUser user;




public void runTest(SingleUser user){
    this.user = user;
    testOnFireFox();
}

public void testOnFireFox(){
   page = new SignupPage("Firefox");
   validateElements();
   signup();

}


    public void signup(){
        page.signup(user.getUserName(), user.getPassword());
    }


    public void validateElements(){
        validateSignupWindowID();
        validateUsernameBox();
        validatePasswordBox();
        validateSignupButton();

   }

    //SignUp Page >> validate signupWindowID
    public void validateSignupWindowID (){
        WebElement e  = page.getSignupWindow();
        boolean status = e.isDisplayed();
        assertEquals(true, status);
        System.out.println("signupWindow : " + status);
    }

    // validate usernameBoxID

    public void validateUsernameBox (){
        WebElement e  = page.getSignupUsernameBox();
        boolean status = e.isDisplayed();
        assertEquals(true, status);
        System.out.println("usernameBox : " + status);
    }

    public void validatePasswordBox (){
        WebElement e  = page.getSignupPasswordBox();
        boolean status = e.isDisplayed();
        assertEquals(true, status);
        System.out.println("passwordBox : " + status);
    }
    // validate SignupButtonIDClass

    public void validateSignupButton (){
        WebElement e  = page.getSignupButton();
        boolean status = e.isDisplayed();
        assertEquals(true, status);
        System.out.println("signupButton: " + status);
    }






}
