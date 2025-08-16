import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConvertorTest {

    @Test
    void testMain_withValidINRInput() {
        String input = "1000\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        CurrencyConvertor.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = out.toString();
        assertTrue(output.contains("Amount in USD: 12.000"));
    }

    @Test
    void testMain_withZeroINRInput() {
        String input = "0\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        CurrencyConvertor.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = out.toString();
        assertTrue(output.contains("Amount in USD: 0.000"));
    }

    @Test
    void testMain_withDecimalINRInput() {
        String input = "1234.56\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        CurrencyConvertor.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = out.toString();
        assertTrue(output.contains("Amount in USD: 14.815"));
    }
}