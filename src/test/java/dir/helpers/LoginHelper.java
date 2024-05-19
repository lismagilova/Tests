package dir.helpers;

import dir.ApplicationManager;
import dir.model.AccountData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LoginHelper extends HelperBase {
    public LoginHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void Login(AccountData user) {
        driver.findElement(By.id("txtLogin")).click();
        driver.findElement(By.id("txtLogin")).sendKeys(user.getUsername());
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(user.getPassword());
        driver.findElement(By.linkText("Вход")).click();
    }

    public void Logout() {
        driver.findElement(By.id("mLogoff")).click();
    }

    public boolean isLoggedIn() {
        try {
            return driver.findElement(By.id("mLogoff")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isLoggedOut() {
        try {
            return driver.findElement(By.linkText("Вход")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
