package org.example.javanumber;

import java.util.Scanner;

public class SumOfEvenAndProdOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, prod = 1, digit;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            else
                prod = prod * digit;
            n = n / 10;
        }
        System.out.println("Sum of the number: " + sum);
        System.out.println("Prod of the number " + prod);
    }
}
