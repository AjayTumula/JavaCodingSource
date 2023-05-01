package org.example.string;

import java.util.Scanner;

public class EqualsString {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string:");
        s1= sc.nextLine();
        System.out.println("Enter second string:");
        s2= sc.nextLine();
        System.out.println("Case sensitive checking");
        if(s1.equals(s2))
        {
            System.out.println("Equal string");
        }
        else
        {
            System.out.println("Not equal string");
        }
        System.out.println("Non-case sensitive checking");
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equal string");
        }
        else
        {
            System.out.println("Not equal string");
        }
    }
}
