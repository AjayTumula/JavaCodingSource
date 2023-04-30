package org.example.javanumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, z, count = 0, digit, prod, i, sum = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        z = n;
        while (z > 0) {
            count = count + 1;
            z = z / 10;
            digit = z % 10;
            prod = 1;
            for (i = 1; i <= count; i++)
                prod = prod * digit;
            sum = sum + prod;
        }
        System.out.println("Number of digits in the number:" + count);

//         z = n;
//         while(z>0)
//         {
//             digit = z%10;
//             prod = 1;
//             for(i = 1; i <=count; i++)
//                 prod = prod * digit;
//             sum = sum + prod;
//         }
        if (sum == n)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
    }
}
