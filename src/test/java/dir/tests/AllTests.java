package dir.tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AuthorizationTest.class,
        EditTest.class,
        NoteCreationTest.class,
        LogoutTest.class
})
public class AllTests {}
