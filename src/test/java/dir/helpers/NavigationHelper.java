package dir.helpers;

import dir.ApplicationManager;

public class NavigationHelper extends HelperBase{
    private String baseURL;

    public NavigationHelper(ApplicationManager applicationManager, String baseURL) {
        super(applicationManager);
        this.baseURL = baseURL;
    }

    public void GoToHomePage() {
        driver.get("https://www.bumajko.ru/");
    }
}
