package org.example.string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String s;
        int i,j,flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        s= sc.nextLine();
        s= s.toUpperCase();
        i=0;
        j= s.length()-1;
        flag=0;
        while(i<j && flag==0)
        {
            if(s.charAt(i)!= s.charAt(j))
            {
                flag=1;
                break;
            }
            i=i+1;
            j=j-1;
        }
        if(flag==0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
