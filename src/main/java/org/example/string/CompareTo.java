package org.example.string;

import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        s1= sc.nextLine();
        System.out.println("Enter second string");
        s2= sc.nextLine();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("s1 is equal to s2");
        } else if(s1.compareTo(s2)>0)
        {
            System.out.println("s1 is greater than s2");
        } else {
            System.out.println("s2 is greater than s1");
        }

    }
}
