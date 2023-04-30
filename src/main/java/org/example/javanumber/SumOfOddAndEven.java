package org.example.javanumber;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n, r, sum = 0;     //
        n = sc.nextInt();
        while (n > 0) {                    //first code block
            r = n % 10;                                       //
            if ((r % 2) != 0)
                sum = sum + r;
            n = n / 10;
        }//
        if (sum % 2 == 0) {         //
            System.out.println("-1");                 // Second code block
        } else {                                             //
            System.out.println("1");
        }
    }
}



