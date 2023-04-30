package org.example.javanumber;

import java.util.Scanner;

public class PowerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y, prod =1;
        System.out.println("Enter the base number:");
        x = sc.nextInt();
        System.out.println("Enter the power number");
        y = sc.nextInt();
        for(; y>0; y--)
            prod = prod *  x;
        System.out.println("Value:" +prod);
    }
}
