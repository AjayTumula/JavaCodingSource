package org.example.javanumber;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the number");
        a = sc.nextInt();
        System.out.println("Enter next number");
        b = sc.nextInt();
        System.out.println("Enter next number");
        c = sc.nextInt();
//        if(a > b)
//            System.out.println("Max number = " +a);
//        else
//            System.out.println("Max number = " +b);
//
        if(a>b && a>c)
            System.out.println("Max number = " +a);
        else if (b>a && b > c) {
            System.out.println("Max number = " +b);
        }
            else
            System.out.println("Max number = " +c);

        }
    }

