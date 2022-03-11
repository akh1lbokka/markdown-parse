import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void subtraction() {
        assertEquals(10, 20-10);
    }

    @Test
    public void testLabReportTest1() throws IOException {
        String fileContents = Files.readString(Path.of("codesnippet1.md"));
        ArrayList<String> testOutput = MarkdownParse.getLinks(fileContents.split("\n"));
        assertEquals("Check first element in array", "`google.com", testOutput.get(0));
        assertEquals("Check second element in array", "google.com", testOutput.get(1));
        assertEquals("Check third element in array", "ucsd.edu", testOutput.get(2));
        assertEquals("Array should contain three elements", 3, testOutput.size());
    }

    @Test
    public void testLabReportTest2() throws IOException {
        String fileContents = Files.readString(Path.of("codesnippet2.md"));
        ArrayList<String> testOutput = MarkdownParse.getLinks(fileContents.split("\n"));
        assertEquals("Check first element in array", "a.com", testOutput.get(0));
        assertEquals("Check second element in array", "a.com(())", testOutput.get(1));
        assertEquals("Check third element in array", "example.com", testOutput.get(2));
        assertEquals("Array should contain three elements", 3, testOutput.size());
    }

    @Test
    public void testLabReportTest3() throws IOException {
        String fileContents = Files.readString(Path.of("codesnippet3.md"));
        ArrayList<String> testOutput = MarkdownParse.getLinks(fileContents.split("\n"));
        assertEquals("Check first element in array", "https://ucsd-cse15l-w22.github.io/", testOutput.get(0));
        assertEquals("Array should contain one element", 1, testOutput.size());
    }
}


    
