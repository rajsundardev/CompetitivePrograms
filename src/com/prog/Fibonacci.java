package com.prog;

import java.util.stream.Stream;

public class Fibonacci {
    static void fibonacciNum(int n) {
        int n1 = 0, n2 = 1;
        int n3 = 0;
        for (int i = 0; i < n - 1; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        //Using java 8
        System.out.println("-------Fibonacci using java 8 stream");

        Stream.iterate(new int[]{0, 1}, fibo -> new int[]{fibo[1], fibo[0] + fibo[1]})
                .limit(10)
                .forEach(fibo -> System.out.print(fibo[1] + " "));
    }


    public static void main(String[] args) {
        Fibonacci.fibonacciNum(10);
    }
}
