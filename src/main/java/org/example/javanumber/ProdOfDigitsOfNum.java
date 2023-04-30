package org.example.javanumber;

import java.util.Scanner;

public class ProdOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, prod = 1;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while (n > 0) {
            prod = prod * (n % 10);
            n = n / 10;
        }
        System.out.println("Product of the digits:" + prod);
    }
}
