package org.example.javanumber;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 1, z = 0, n, term = 1;
        System.out.println("Enter max value:");
        n = sc.nextInt();
        while (z <= n) {
            System.out.println(z);
            x = y;
            y = z;
            z = x + y;
//            term = term +1;
        }
    }
}
