package test;
import com.project.app.ui.UserData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestUserData {
@Test
    public void testUserData(){
        UserData ud = new UserData();
        String timestamp = ud.getTimestamp();
        String username = "user" + ud.getTimestamp();
        String email = "email" + ud.getTimestamp()+ "@gmail.com";
        String password = "pass" + ud.getTimestamp();

        assertEquals(timestamp, ud.getTimestamp());
        assertEquals(username, ud.getUser());
        assertEquals(password, ud.getPassword());
        assertEquals(email, ud.getEmail());
    }
}
