package dir.tests;

import dir.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    protected ApplicationManager app;

    public Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        app = new ApplicationManager();
//        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        app.Stop();
    }
}
