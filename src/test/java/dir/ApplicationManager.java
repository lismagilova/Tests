package dir;

import dir.helpers.LoginHelper;
import dir.helpers.NavigationHelper;
import dir.helpers.NoteHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
    private WebDriver driver;

    private StringBuilder verificationErrors;

    private String baseURL;

    private NavigationHelper navigation;

    private LoginHelper auth;

    private NoteHelper note;

    public ApplicationManager() {
        this.driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1600, 852));
        this.verificationErrors = new StringBuilder();
        this.baseURL = "https://www.bumajko.ru/";
        this.navigation = new NavigationHelper(this, baseURL);
        this.auth = new LoginHelper(this);
        this.note = new NoteHelper(this);
    }

    public void Stop() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public StringBuilder getVerificationErrors() {
        return verificationErrors;
    }

    public void setVerificationErrors(StringBuilder verificationErrors) {
        this.verificationErrors = verificationErrors;
    }

    public String getBaseUrl() {
        return baseURL;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseURL = baseUrl;
    }

    public NavigationHelper getNavigation() {
        return navigation;
    }

    public void setNavigation(NavigationHelper navigation) {
        this.navigation = navigation;
    }

    public LoginHelper getAuth() {
        return auth;
    }

    public void setAuth(LoginHelper auth) {
        this.auth = auth;
    }

    public NoteHelper getNote() {
        return note;
    }

    public void setNote(NoteHelper note) {
        this.note = note;
    }
}
