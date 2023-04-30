package org.example.javanumber;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fac =1;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while(n>0)
        {
            fac = fac * n;
            n = n-1;
        }
        System.out.println("Factorial:" +fac);
//        for ( n= sc.nextInt(); n>0; n= n-1){
//            System.out.println();
//        }
    }
}
