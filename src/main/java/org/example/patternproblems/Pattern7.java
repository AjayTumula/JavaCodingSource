package org.example.patternproblems;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,b, k=5;
        System.out.println("Enter number of rows:");
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for(b=1; b<i; b++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=2*(n-i)+1; j++)
            {
                System.out.print(k);
            }
            k= k-1;
            System.out.println();
            /*
            Printing "*" gives the output
            Enter number of rows:
            5
                    *********
                     *******
                      *****
                       ***
                        *

              Printing "j" gives the output
              Enter number of rows:
              5
                    123456789
                     1234567
                      12345
                       123
                        1

               Printing "i" gives the output
               Enter number of rows:
               5
                     111111111
                      2222222
                       33333
                        444
                         5

               Printing "k" gives the output
               Enter number of rows:
               5
                        555555555
                         4444444
                          33333
                           222
                            1
             */
        }
    }
}
