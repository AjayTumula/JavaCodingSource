package org.example.javanumber;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int i, count, j, n, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
                total = total + 1;
            }
        }
        System.out.println("Total number of prime numbers:" + total);
    }
}
