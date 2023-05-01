package org.example.string;

import java.util.Scanner;

public class FirstString {
    public static void main(String[] args) {
        String name;
        String add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name= sc.nextLine();
        System.out.println("Enter your address:");
        add=sc.nextLine();
        System.out.println("Hello " +name);
        System.out.println("Your address is " +add);
        System.out.println("The length of the name " + name.length());

        for(int i=0;i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
    }
}
