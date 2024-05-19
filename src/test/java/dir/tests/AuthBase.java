package dir.tests;

import dir.Settings;
import dir.model.AccountData;
import org.testng.annotations.BeforeMethod;

public class AuthBase extends TestBase {

    @BeforeMethod
    public void setUpAuth() {
        app.getAuth().Login(new AccountData(Settings.getUsername(), Settings.getPassword()));
    }
}

