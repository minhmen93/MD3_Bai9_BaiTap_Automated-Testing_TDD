package bt3_Fizz_Buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzTranslateTest() {
        int number = 15;
        assertEquals("fizzbuzz",FizzBuzzTranslate.FizzBuzz(number));
    }
    @Test
    void fizzBuzzTranslateTest2() {
        int number = 5;
        assertEquals("buzz",FizzBuzzTranslate.FizzBuzz(number));
    }
    @Test
    void fizzBuzzTranslateTest3() {
        int number = 3;
        assertEquals("fizz",FizzBuzzTranslate.FizzBuzz(number));
    }

}