import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzExerciseTest {

    private FizzBuzzExercise fbe;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String systemOut() {
        return outContent.toString();
    }
    @Before
    public void setup() {
        fbe = new FizzBuzzExercise(15);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_fizzBuzz_when_n_is_15(){
        fbe.fizzBuzz();
        String result = "1\r\n" +
                "2\r\n" +
                "Fizz\r\n" +
                "4\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "7\r\n" +
                "8\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "11\r\n" +
                "Fizz\r\n" +
                "13\r\n" +
                "14\r\n" +
                "FizzBuzz\r\n";
        assertTrue(systemOut().equals(result));
    }
}