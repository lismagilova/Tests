package dir.helpers;

import dir.ApplicationManager;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver driver;

    protected ApplicationManager manager;

    public HelperBase(ApplicationManager manager) {
        this.driver = manager.getDriver();
        this.manager = manager;
    }
}
