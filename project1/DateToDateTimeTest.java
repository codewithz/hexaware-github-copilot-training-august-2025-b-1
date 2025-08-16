import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateToDateTimeTest {

    @Test
    void testConvertToDateTime_MidYearDate() {
        LocalDate date = LocalDate.of(2025, 8, 15);
        LocalDateTime expected = LocalDateTime.of(2025, 8, 15, 0, 0);
        LocalDateTime actual = DateToDateTime.convertToDateTime(date);
        assertEquals(expected, actual);
    }

    @Test
    void testConvertToDateTime_NewYear() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        LocalDateTime expected = LocalDateTime.of(2025, 1, 1, 0, 0);
        LocalDateTime actual = DateToDateTime.convertToDateTime(date);
        assertEquals(expected, actual);
    }

    @Test
    void testConvertToDateTime_EndOfYear() {
        LocalDate date = LocalDate.of(2025, 12, 31);
        LocalDateTime expected = LocalDateTime.of(2025, 12, 31, 0, 0);
        LocalDateTime actual = DateToDateTime.convertToDateTime(date);
        assertEquals(expected, actual);
    }

    @Test
    void testConvertToDateTime_LeapYear() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        LocalDateTime expected = LocalDateTime.of(2024, 2, 29, 0, 0);
        LocalDateTime actual = DateToDateTime.convertToDateTime(date);
        assertEquals(expected, actual);
    }
}