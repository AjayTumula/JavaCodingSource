package org.example.array;

import java.util.Scanner;

public class LinearSearch {
    int a[] = new int[10];
    int key;
    void getData()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++) {
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value to search");
        key = sc.nextInt();
    }

    void search()
    {
        int i, flag=0, pos = 0;
        for(i =0; i<10 && flag==0; i++) {
            if (a[i] == key) {
                flag = 1;
                pos = i + 1;
            }
        }
        if(flag==1)
            System.out.println("Number found at position:" +pos);
        else
            System.out.println("Number not found");
    }

}
