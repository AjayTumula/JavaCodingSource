package org.example.patternproblems;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, b, k=1;
        System.out.println("Enter number or rows:");
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for(b=1; b<i; b++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=n+1-i; j++)
            {
                System.out.print("*");
            }
//            k =k+1;
            /*
            Printing "j" the output will be
                12345
                 1234
                  123
                   12
                    1

             Printing "i" the output will be
                 11111
                  2222
                   333
                    44
                     5

             Printing "k" the output will be
                   11111
                    2222
                     333
                      44
                       5

              Printing "k" with k=k-1 and assigning k=5 the output will be
                   55555
                    4444
                     333
                      22
                       1
             */

            System.out.println();
        }
    }
}
