package exercise03.tongcacchuso;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        long n = scanner.nextLong();

        n = Math.abs(n);

        int sum = 0;
        long temp = n;

        while (temp > 0) {
            sum += (int) (temp % 10); // ép kiểu tường minh, hết cảnh báo
            temp /= 10;
        }

        System.out.println("Tổng các chữ số của " + n + " là: " + sum);

        scanner.close();
    }
}
