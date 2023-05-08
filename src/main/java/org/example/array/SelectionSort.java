package org.example.array;

import java.util.Scanner;

public class SelectionSort {
    int a[] = new int[7];
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<7;i++)
        {
            System.out.println("Enter number:");
            a[i]=sc.nextInt();
        }
    }

    void putData()
    {
        int i;
        for(i=0;i<7;i++)
            System.out.println(a[i]);
    }

    void sort()
    {
        int i,j,t;
        for(i=0;i<6;i++) {
            for(j=i+1;j<7;j++) {
                if(a[i]>a[j]) {
                    t =a[i];
                    a[i] =a[j];
                    a[j] =t;
                }
            }
        }
//        System.out.println(a[i]);
    }
}
