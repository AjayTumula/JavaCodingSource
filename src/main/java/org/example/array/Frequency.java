package org.example.array;

import java.util.Scanner;

public class Frequency {
    int a[] = new int[10];
    int key;
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++)
        {
            System.out.println("Enter Number:");
            a[i]= sc.nextInt();
        }
        System.out.println("Enter number to find frequency:");
        key= sc.nextInt();
    }

    void count()
    {
        int i,count=0;
        for(i=0;i<10;i++)
        {
            if(a[i]==key)
                count = count+1;
        }
        System.out.println("Frequency of the given number:" +count);
    }
}
