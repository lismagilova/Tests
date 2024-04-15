package dir.tests;

import dir.model.AccountData;
import dir.model.NoteData;
import org.junit.Test;

public class EditTest extends TestBase{
    @Test
    public void thirdTest() {
        app.getNavigation().GoToHomePage();
        AccountData user = new AccountData("gismagilova402@gmail.com", "gusenica");
        app.getAuth().Login(user);
        NoteData note = new NoteData("");
        app.getNote().EditNote(note);
    }
}

