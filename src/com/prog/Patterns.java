package com.prog;

import java.util.stream.Stream;

public class Patterns {
    /*
        Output:
        * * *
        * * *
        * * *
     */

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     */
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
     */
    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
     */
    public void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " "); // print the ith element will provide the pattern
            }
            System.out.println();
        }
    }

    /*
     ****
     ***
     **
     *

     */
    // n - row(i) + 1
    public void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    12345
    1234
    123
    12
    1
     */
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

         *
       * * *
     * * * * *
    * * * * * * *
  * * * * * * * * *

     */
    // need to find the spaces from each column
    // 2*i +1 - to get the pattern

    public void pattern7(int n) {
        //space
        for (int i = 0; i < n; i++) {

            //space
            for (int j = 0; j < n - i - 1; j++) { // n-i-1
                System.out.print(" ");
            }
            //print
            for (int j = 0; j < 2 * i + 1; j++) { // 2*i + 1
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n - i - 1; j++) { // n-i-1
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*
    * * * * *
      * * *
        *
     */

    // need to find the spaces from each column
    // 2n-(2*i +1) - to get the pattern
    // spaces will be same as ith value
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {

            //space
            for (int j = 0; j < i; j++) { // n-i-1
                System.out.print(" ");
            }
            //print
            for (int j = 0; j < 2*n - (2 * i + 1); j++) { // 2n-(2*i + 1)
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) { // n-i-1
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

     */

    // 2n - i

    public void pattern9(int n) {

        for (int i=1;i<=2*n-1;i++) {
            int stars = i;
            if(i > n) stars = 2 * n - i;

            for (int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    01
    101
    0101
    10101
     */

    //even number column always startes with 1 and odd is 0
    public void pattern10(int n) {
        int start = 1;
        for (int i=0;i<n;i++) {

            if(i % 2 == 0) start = 1;
            else start = 0;
            for (int j=0;j<i;j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        //patterns.pattern1(4);
        //patterns.pattern2(5);
        //patterns.pattern3(4);
        //patterns.pattern4(4);
        //patterns.pattern5(5);
        //patterns.pattern6(5);
        //patterns.pattern7(7);
        //patterns.pattern8(7);
        //patterns.pattern9(5);
        patterns.pattern10(5);

        Stream.iterate(new int[]{0, 1}, f-> new int[] {f[1], f[0] + f[1]})
                .limit(10)
                .map(m-> m[0])
                .forEach(fibo-> System.out.print(fibo + " "));

    }
}
