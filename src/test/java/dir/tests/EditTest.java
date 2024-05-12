package dir.tests;

import dir.model.AccountData;
import dir.model.NoteData;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class EditTest extends TestBase{
    @Test
    public void editNote() {
        app.getNavigation().GoToHomePage();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AccountData user = new AccountData("gismagilova402@gmail.com", "gusenica");
        app.getAuth().Login(user);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NoteData note = new NoteData("");
        app.getNote().EditNote(note);
    }
}

