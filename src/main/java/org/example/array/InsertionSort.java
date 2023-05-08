package org.example.array;

import java.util.Scanner;

public class InsertionSort {
    int a[]= new int[10];
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number:");
            a[i]=sc.nextInt();
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
        int i,j,val;
        for(i=0;i<10;i++)
        {
            val=a[i];
            j=i-1;
            while(val<a[j])
            {
                a[j+1]=a[j];
                j--;
                if(j==-1)
                    break;
            }
            a[j+1]=val;
        }
    }
}
