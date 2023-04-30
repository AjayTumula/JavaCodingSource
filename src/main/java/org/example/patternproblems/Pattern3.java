package org.example.patternproblems;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, j, k= 1;
        System.out.println("Enter number of rows");   //5
        n = sc.nextInt();

       /* for(; n >= 1; n--)
        {
            for(j = 1; j <= n; j++)
            {
                System.out.print(k );
            }
            k = k+1;
            System.out.println();
        } */
        /* Output    11111
                     2222
                     333
                     44
                     5
         */

        for(; n >=1; n--)
        {
            for(j=1; j <=n; j++)
            {
                System.out.print(k+j );
            }
            k = k+1;
            System.out.println();
        }
        /* Output
        Enter number of rows
        5

        23456
        3456
        456
        56
        6
         */
    }
}
