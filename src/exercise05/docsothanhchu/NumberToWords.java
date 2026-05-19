package exercise05.docsothanhchu;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số (100-999): ");
        int n = scanner.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Số nhập vào không hợp lệ.");
            return;
        }

        int hundreds = n / 100;
        int tens = (n % 100) / 10;
        int units = n % 10;

        String result = readHundreds(hundreds)
                + readTens(tens, units);

        System.out.println(result);
        scanner.close();
    }

    static String readHundreds(int d) {
        return switch (d) {
            case 1 -> "Một trăm ";
            case 2 -> "Hai trăm ";
            case 3 -> "Ba trăm ";
            case 4 -> "Bốn trăm ";
            case 5 -> "Năm trăm ";
            case 6 -> "Sáu trăm ";
            case 7 -> "Bảy trăm ";
            case 8 -> "Tám trăm ";
            case 9 -> "Chín trăm ";
            default -> "";
        };
    }

    static String readTens(int tens, int units) {
        switch (tens) {
            case 0:
                if (units == 0) return "";
                return "lẻ " + readUnit(units);


            case 1:
                if (units == 0) return "mười";
                if (units == 1) return "mười một";
                if (units == 5) return "mười lăm";
                return "mười " + readUnit(units);

            default:
                String result = readUnit(tens) + " mươi";
                if (units == 0) return result;
                if (units == 1) return result + " mốt";
                if (units == 5) return result + " lăm";
                return result + " " + readUnit(units);
        }
    }

    static String readUnit(int d) {
        return switch (d) {
            case 1 -> "một";
            case 2 -> "hai";
            case 3 -> "ba";
            case 4 -> "bốn";
            case 5 -> "năm";
            case 6 -> "sáu";
            case 7 -> "bảy";
            case 8 -> "tám";
            case 9 -> "chín";
            default -> "";
        };
    }
}
