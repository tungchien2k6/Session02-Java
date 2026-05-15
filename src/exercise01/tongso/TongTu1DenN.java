package exercise01.tongso;

import java.util.Scanner;

public class TongTu1DenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int sum = 0;

            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            System.out.println("Tổng các số từ 1 đến " + N + " là: " + sum);
        }

        sc.close();
    }
}