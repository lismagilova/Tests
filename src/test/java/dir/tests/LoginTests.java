package dir.tests;

import dir.ApplicationManager;
import dir.Settings;
import dir.model.AccountData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginWithValidData() {
        AccountData validUser = new AccountData(Settings.getUsername(), Settings.getPassword());

        app.getAuth().Login(validUser);

        Assert.assertTrue(app.getAuth().isLoggedIn(validUser.getUsername()));
    }

    @Test
    public void LoginWithInvalidData() {
        AccountData invalidUser = new AccountData("invalidUsername", "invalidPassword");

        app.getAuth().Login(invalidUser);

        Assert.assertFalse(app.getAuth().isLoggedIn());
    }

    @Before
    public void setUp() {
        app = ApplicationManager.GetInstance();
        if (app.getAuth().isLoggedIn()) {
            app.getAuth().Logout();
        }
    }

}
