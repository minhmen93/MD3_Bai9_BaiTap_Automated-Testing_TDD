package bt1_NextDay;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
//        Scanner nextDay = new Scanner(System.in);
//        System.out.println("Nhập vào ngày : ");
//        int day = Integer.parseInt(nextDay.next());
//        System.out.println("Nhập vào tháng : ");
//        int month = nextDay.nextInt();
//        System.out.println("Nhập vào năm :");
//        int year = nextDay.nextInt();
//
//        LocalDate dayMonth = LocalDate.of(year,month,day);
//        System.out.println(dayMonth.plusDays(1));
// test case ko cần hàm main
    }
   public static String nextDay (int day, int month, int year){
       // thuật toán trả về ngày tiếp theo duưới dạng chuỗi dd/MM/yyyy
       LocalDate dayMonth = LocalDate.of(year,month,day);
       LocalDate newDayUpdate = dayMonth.plusDays(1);
       String DateStr = newDayUpdate.format(DateTimeFormatter.ISO_DATE.ofPattern("dd/MM/yyyy"));
       return DateStr;
   }

}
