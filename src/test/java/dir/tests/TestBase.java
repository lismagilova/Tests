package dir.tests;

import dir.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    protected ApplicationManager app;

    @Before
    public void setUp() {
        app = ApplicationManager.GetInstance();
    }
}
