package dir.tests;

import dir.model.AccountData;
import dir.model.NoteData;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class EditTest extends TestBase{
    @Test
    public void editNote() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NoteData note = new NoteData("");
        app.getNote().EditNote(note);
    }
}

