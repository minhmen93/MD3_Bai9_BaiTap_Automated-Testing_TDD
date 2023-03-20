package bt3_Fizz_Buzz;

public class FizzBuzzTranslate {
    static String FizzBuzz(int number) {
      if (number % 15 == 0){
          return "fizzbuzz";
      } else if (number%5 ==0) {
          return "buzz";
      } else if (number%3==0) {
          return "fizz";
      }
      return String.valueOf(number);
    }
}

