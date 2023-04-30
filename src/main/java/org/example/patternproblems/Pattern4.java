package org.example.patternproblems;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, s, j;
        System.out.println("Enter number of rows:");  // 4
        n = sc.nextInt();
        for (i =1; i <=n; i++)
        {
            for (s =1; s<=n-i; s++)
            {
                System.out.print(" ");
            }
            for (j =1; j<=i; j++)
            {
                System.out.print("*");
                /*
                Here, printing "i" gives you the output of
                        1
                       22
                      333
                     4444
                Printing "j" gives you the output of
                        1
                       12
                      123
                     1234
               Printing "i+j" gives you the output of
                       2
                      34
                     456
                    5678
               Printing "*" gives you the output of
                        *
                       **
                      ***
                     ****
                 */
            }
            System.out.println();
        }
    }
}
