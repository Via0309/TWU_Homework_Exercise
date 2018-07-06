import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TriangleExerciseTest {
    private TriangleExercise te;

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String systemOut() {
        return outContent.toString();
    }
    @Before
    public void setup() {
        te = new TriangleExercise();
        System.setOut(new PrintStream(outContent));
    }
    public TriangleExerciseTest(){
        te = new TriangleExercise();
    }


    @Test
    public void should_print_one_asterisk(){
        te.printOneAsterisk();
        assertTrue(systemOut().equals("*\r\n"));
    }

    @Test
    public void should_print_eight_asterisks_horizontal_line_when_n_is_8(){
        te.printHorizontalLine(8);
        assertTrue(systemOut().equals("********\r\n"));
    }

    @Test
    public void should_print_two_asterisks_vertical_line_when_n_is_2(){
        te.printVerticalLine(2);
        String str = systemOut();
        assertTrue(systemOut().equals("*\r\n*\r\n"));
    }
}