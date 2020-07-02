import com.project.app.ui.SingleUser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.TestLoginPage;
import test.TestSignupPage;

import java.awt.*;

public class RunTests {

    @Test
    public void runSignupLogin(){
        SingleUser user = SingleUser.getUser();
        TestSignupPage signup = new TestSignupPage();
        signup.runTest(user);
        TestLoginPage login = new TestLoginPage();
        login.runTest(user);
    }

    @Test
    public void runLogin(){

    }



}
