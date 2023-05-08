package org.example.array;

import java.util.Scanner;

public class BubbleSort {
    int a[]=new int[10];
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("Enter number:");
            a[i]= sc.nextInt();
        }
    }

    void putData()
    {
        int i;
        for(i=0;i<10;i++)
            System.out.println(a[i]);
    }

    void sort()
    {
        int i,j,t;
        for(i=0;i<10;i++)
            for(j=0;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
    }
}
