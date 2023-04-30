package org.example.javanumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, i;
        System.out.println("Enter a number:");  //n = 7  i = 1,2,3,4,5,6,7
        n = sc.nextInt();
//        i = 1;
//        while (i <= n)
//        {
//            if(n%i == 0)
//                count = count + 1;
//            i = i+1;
//        }
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                count = count + 1;
        }
        if (count == 2)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
