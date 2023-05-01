package org.example.string;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        int i,count=1;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        s = sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count= count+1;
            }
        }
        System.out.println("The word count for the given string is:" +count);
    }
}
