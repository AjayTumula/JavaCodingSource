package org.example.patternproblems;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j,b, k=1;
        System.out.println("Enter number of rows:");
        n= sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for(b=1; b<=n-i; b++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print(k);
            }
            k=k+1;
            /*
            Printing "i" gives the output
            Enter number of rows:
            5
                        1
                       222
                      33333
                     4444444
                    555555555

            Printing "j" gives the output
            Enter number of rows:
            5
                           1
                          123
                         12345
                        1234567
                       123456789

            Printing "*" gives the output
            Enter number of rows:
            5
                            *
                           ***
                          *****
                         *******
                        *********

             Printing "k" gives the output
             5
                             1
                            222
                           33333
                          4444444
                         555555555
             */
            System.out.println();
        }
    }
}
