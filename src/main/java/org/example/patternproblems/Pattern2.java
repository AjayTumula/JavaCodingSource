package org.example.patternproblems;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, j;
        System.out.println("Enter number of rows:");  //5
        n = sc.nextInt();

        // Logic to print the "*"
        for (; n>=1; n--) {
            for (j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         /* Output
          *****
          ****
          ***
          **
          *

          */

        // Logic to print the number
        /* for (; n >= 1; n--) {
            for (j = 1; j <= n; j++) {
                System.out.print(j );
            }
            System.out.println();
        } */
             /*Output      12345
                           1234
                           123
                           12
                           1  */

        //Logic to print n
        /*for (; n >= 1; n--) {
            for (j = 1; j <= n; j++) {
                System.out.print(n );
            }
            System.out.println();
        } */
                /* Output   55555
                            4444
                            333
                            22
                            1   */

    }
}
