package dir.helpers;

import dir.ApplicationManager;
import dir.model.NoteData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NoteHelper extends HelperBase {
    public NoteHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void AddNewNote(NoteData note) {
        driver.findElement(By.cssSelector("div:nth-child(1) > a:nth-child(8)")).click();
    }

    public void EditNote(NoteData note, String newText) {
        driver.findElement(By.cssSelector("#noteid34836 .full")).click();
        driver.findElement(By.cssSelector("#noteid34836 .full")).clear();
        driver.findElement(By.cssSelector("#noteid34836 .full")).sendKeys(newText);
    }

    public int getNotesCount() {
        List notes = driver.findElements(By.cssSelector(".notes-cont"));
        return notes.size();
    }

    public String getNoteText() {
        WebElement noteElement = driver.findElement(By.cssSelector("#noteid34836 .full"));

        // Используем JavaScript для получения значения
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String noteText = (String) js.executeScript("return arguments[0].value;", noteElement);

//        System.out.println("новый текст:" + noteText);
        return noteText;
    }
}
