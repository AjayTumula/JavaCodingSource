package org.example.string;

import java.util.Scanner;

public class MethodsOfStrings {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        str1=sc.nextLine();
        System.out.println("Enter second string:");
        str2= sc.nextLine();
        String str3;
        str3= str1.concat(str2);
        System.out.println(str3);
        System.out.println(str3.substring(2,5));
        System.out.println(str3.indexOf('a',3));
    }
}
