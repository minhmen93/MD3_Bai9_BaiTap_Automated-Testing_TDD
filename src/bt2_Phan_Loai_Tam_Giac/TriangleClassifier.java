package bt2_Phan_Loai_Tam_Giac;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a : ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b : ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào cạnh c : ");
        int c = scanner.nextInt();
        checkTriangle(a, b, c);
    }

    static String checkTriangle(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if (a + b > c && a + c > b && b + c > a) {
            if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                return "Tam giác vuông";
            } else if (a == b && b == c) {
                return "Tam giác đều";
            } else if (a == b || b == c || a == c) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường ";
            }
        } else {
            return "Không phải là tam giác ";

        }

    }
}