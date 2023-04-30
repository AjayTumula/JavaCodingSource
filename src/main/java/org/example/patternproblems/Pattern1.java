package org.example.patternproblems;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, j;
        int i;
        System.out.println("Enter number of rows:");    //5
        n = sc.nextInt();

       //Logic to print *
       for (i=1; i<=n; i++) {                 // considering only n and j variable
            for (j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /* Output  *
                   * *
                   * * *
                   * * * *
                   * * * * *
         */

        //Logic to print number in increase order row wise
       /*for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j );
            }
            System.out.println();
        }*/
        /* Output
            1
            12
            123
            1234
            12345
         */

        //Logic to print the repeating number in row wise
       /*for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i );
            }
            System.out.println();
        } */
        /* Output
            1
            22
            333
            4444
            55555
         */

        /*for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i+j );
            }
            System.out.println();
        }*/

        /* Output
        Enter number of rows:
        5
        2
        34
        456
        5678
        678910
         */
    }
}
