package org.example.patternproblems;


import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,b,k=1;
        System.out.println("Enter number of rows:");
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for(b=1; b<=n-i; b++) {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        n=n-1;
        for(i=1; i<=4; i++)
        {
            for(b=1; b<=i; b++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=2*(n-i)+1; j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();

            /*
            Printing "i" in the first loop and printing "n+1-i" in the second loop
            Enter number of rows:
            5
                        1
                       222
                      33333
                     4444444
                    555555555
                     4444444
                      33333
                       222
                        1

            Printing "*" in the first loop and "*" in the second loop
            Enter number of rows:
            5
                           *
                          ***
                         *****
                        *******
                       *********
                        *******
                         *****
                          ***
                           *
             */

        }
    }
}
