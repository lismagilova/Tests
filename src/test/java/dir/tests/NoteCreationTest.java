package dir.tests;// Generated by Selenium IDE
import dir.model.AccountData;
import dir.model.NoteData;
import dir.tests.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
public class NoteCreationTest extends TestBase {
    @Test
    public void createNote() {
        app.getNavigation().GoToHomePage();
        AccountData user = new AccountData("gismagilova402@gmail.com", "gusenica");
        app.getAuth().Login(user);
        NoteData note = new NoteData("");
        app.getNote().AddNewNote(note);
    }
}



