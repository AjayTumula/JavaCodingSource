package org.example.array;

import java.util.Scanner;

public class BinarySearch {
    int a[] = new int[10];
    int key;
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i =0; i<10;i++) {
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a value to search:");
        key= sc.nextInt();
    }

    void output()
    {
        int i;
        for(i=0;i<10;i++)
            System.out.println(a[i]);
    }

    void search()
    {
        int i, j, mid, flag=0,pos=0;
        i=0;
        j=9;
        while(i<=j && flag==0)
        {
            mid=i+j/2;
            if(a[mid]==key)
            {
                flag=1;
                pos = mid+1;
            }
            if(a[mid]>key)
            {
                j=mid-1;
            }
            if(a[mid]<key)
            {
                i=mid+1;
            }
        }
        if(flag==0)
            System.out.println("Number not found");
        else
            System.out.println("Number found at position:" +pos);
    }
}
