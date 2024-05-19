package dir.tests;

import dir.ApplicationManager;
import org.junit.Before;

public class TestBase {
    protected ApplicationManager app;

    @Before
    public void setUp() {
        app = ApplicationManager.GetInstance();
    }
}
