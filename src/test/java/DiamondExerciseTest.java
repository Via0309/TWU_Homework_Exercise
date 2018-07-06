import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondExerciseTest {
    private DiamondExercise de;

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String systemOut() {
        return outContent.toString();
    }
    @Before
    public void setup() {
        de = new DiamondExercise();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_isosceles_triangle(){
        de.printIsocelesTriangle(3);
        String result = "  *  \r\n" +
                " *** \r\n" +
                "*****\r\n";
        assertTrue(systemOut().equals(result));
    }

    @Test
    public void test_Diamond(){
        de.printDiamond(3);
        String result =
                "  *  \r\n" +
                " *** \r\n" +
                "*****\r\n" +
                " *** \r\n" +
                "  *  \r\n" ;
        assertTrue(systemOut().equals(result));
    }

    @Test
    public void test_diamond_with_name(){
        de.printDiamondWithName(3);
        String result =
                "  *  \r\n" +
                " *** \r\n" +
                "Via\r\n" +
                " *** \r\n" +
                "  *  \r\n" ;
        assertTrue(systemOut().equals(result));
    }
}