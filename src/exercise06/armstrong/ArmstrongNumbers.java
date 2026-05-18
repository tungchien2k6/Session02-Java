package exercise06.armstrong;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break;
            } else {
                scanner.next();
            }
            System.out.println("Số nhập vào không hợp lệ.");
        }

        System.out.println("Các số Armstrong từ 0 đến " + n + ":");

        for (int i = 0; i <= n; i++) {

            int k;
            if (i == 0) {
                k = 1;
            } else {
                k = 0;
                int temp = i;
                while (temp > 0) {
                    k++;
                    temp /= 10;
                }
            }

            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int j = 0; j < k; j++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }


            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
