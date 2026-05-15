package exercise02.timsongay;

import java.util.*;

public class TimSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tháng: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Tháng 1");
                System.out.println("Có 31 ngày");
                break;

            case 2:
                System.out.println("Tháng 2");
                System.out.println("Có 28 hoặc 29 ngày");
                break;

            case 3:
                System.out.println("Tháng 3");
                System.out.println("Có 31 ngày");
                break;

            case 4:
                System.out.println("Tháng 4");
                System.out.println("Có 30 ngày");
                break;

            case 5:
                System.out.println("Tháng 5");
                System.out.println("Có 31 ngày");
                break;

            case 6:
                System.out.println("Tháng 6");
                System.out.println("Có 30 ngày");
                break;

            case 7:
                System.out.println("Tháng 7");
                System.out.println("Có 31 ngày");
                break;

            case 8:
                System.out.println("Tháng 8");
                System.out.println("Có 31 ngày");
                break;

            case 9:
                System.out.println("Tháng 9");
                System.out.println("Có 30 ngày");
                break;

            case 10:
                System.out.println("Tháng 10");
                System.out.println("Có 31 ngày");
                break;

            case 11:
                System.out.println("Tháng 11");
                System.out.println("Có 30 ngày");
                break;

            case 12:
                System.out.println("Tháng 12");
                System.out.println("Có 31 ngày");
                break;

            default:
                System.out.println("Tháng không hợp lệ.");
        }

        sc.close();
    }
}
