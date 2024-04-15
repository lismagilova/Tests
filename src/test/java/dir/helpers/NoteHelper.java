package dir.helpers;

import dir.ApplicationManager;
import dir.model.NoteData;
import org.openqa.selenium.By;

public class NoteHelper extends HelperBase {
    public NoteHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void AddNewNote(NoteData note) {
        driver.findElement(By.cssSelector("div:nth-child(1) > a:nth-child(8)")).click();
    }

    public void EditNote(NoteData note) {
        driver.findElement(By.cssSelector("#noteid34498 .full")).click();
        driver.findElement(By.cssSelector("#noteid34498 .full")).sendKeys("Первая запись!\\n");
    }
}
