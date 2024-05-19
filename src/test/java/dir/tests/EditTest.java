package dir.tests;

import dir.model.NoteData;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

public class EditTest extends AuthBase{
    @Test
    public void editNote() {
        String newNoteText = "Новый текст заметки";

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        NoteData note = new NoteData("");
        app.getNote().EditNote(note, newNoteText);

        String editedNoteText = app.getNote().getNoteText();

        Assert.assertEquals("Заметка не была отредактирована", newNoteText, editedNoteText);
    }
}

