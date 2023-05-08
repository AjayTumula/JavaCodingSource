package org.example.array;

import java.util.Scanner;

public class ProdOfArray {
    public static void main(String[] args) {
        int size,prod=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        size= sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter a number:");
            a[i] =sc.nextInt();
        }
        for(int i =0; i<size; i++)
            prod = prod* a[i];
        System.out.println("Production of the elements of array:" +prod);
    }
}
