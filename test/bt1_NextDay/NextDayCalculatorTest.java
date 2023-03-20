package bt1_NextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test Next Day 1 ")
    void testNextDay() {

        int day = 19;
        int month = 2;
        int year = 1993;
        // kết quả chính xaác  : 20/02/1993;
        String expected = "20/02/1993";
        // ết quả trả về bằng hàm nextday
        String result = NextDayCalculator.nextDay(day, month, year);
        // so sánh kết quả trả về và mong muốn xem có chính xác không .
        assertEquals(expected, result);
        // kết quả test pass// thành công
    }

    // test case 2 :
    @Test
    @DisplayName("Test Next Day 2 ")
    void testNextDay2() {

        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "01/02/2018";
        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, result);
    }
    // tương tự test hết các case 1-> 6

}