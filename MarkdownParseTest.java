import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTester() {
        assertEquals("[https://something.com, some-page.html",
        getLinks("test-file.md"));
    }
}
