package org.example.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int size, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter number:");
            a[i]= sc.nextInt();
        }
        for(int i=0; i<size; i++)
            sum = sum + a[i];
        System.out.println("Sum of array elements:" + sum);
    }
}
