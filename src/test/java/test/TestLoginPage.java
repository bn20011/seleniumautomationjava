package test;

import com.project.app.ui.LoginPage;
import com.project.app.ui.SignupPage;
import com.project.app.ui.SingleUser;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class TestLoginPage {
    LoginPage page;
    SingleUser user;


    public void runTest(SingleUser user){
        this.user = user;
        testOnFireFox();
    }

    public void testOnFireFox(){
        page = new LoginPage("Firefox");
        validateLoginElements();
        login();
        //validateConfirmation();

    }

    private void login(){
        page.login(user.getUserName(), user.getPassword());
    }

    private void validateLoginElements(){
        validateLoginLink();
        validateLoginButton();
        validateUserBox();
        validatePasswordBox();
    }

    private void validateConfirmation(){
        validateConfirmationElement();
       // validateConfirmationMsg();
    }
    //validate eLoginLinkID
    private void validateLoginLink(){
        WebElement eLoginLinkID  = page.getLoginLink();
        boolean value = eLoginLinkID.isDisplayed();
        assertEquals(true, value);
        System.out.println("LoginLink: " + value);
    }
    private void validateUserBox(){
        WebElement e  = page.getUserBox();
        boolean value = e.isDisplayed();
        assertEquals(true, value);
        System.out.println("UserBox: " + value);
    }
    private void validatePasswordBox(){
        WebElement e  = page.getPassBox();
        boolean value = e.isDisplayed();
        assertEquals(true, value);
        System.out.println("PasswordBox: " + value);
    }
    private void validateLoginButton(){
        WebElement e  = page.getLoginButton();
        boolean value = e.isDisplayed();
        assertEquals(true, value);
        System.out.println("LoginButton: " + value);
    }

    private void validateConfirmationElement(){
        WebElement e  = page.getConfirmation();
        boolean value = e.isDisplayed();
        assertEquals(true, value);
        System.out.println("Confirmation: " + value);
    }
    private void validateConfirmationMsg(){
        String expected = user.getUserName();
        String actual  = page.getConfirmation().getText();
        boolean status = actual.contains(expected);

        assertEquals(true, actual);
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
        System.out.println("Confirmation:" + status);
    }
}
