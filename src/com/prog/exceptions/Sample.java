package com.prog.exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {

        //
        String s = "rajsundar";

//        s = s.chars().mapToObj(c-> String.valueOf((char)c)).sorted()
//                .collect(Collectors.joining());

        s= Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        System.out.println("Sorted string: " + s);



        System.out.println("Sorted java 8 : " + s);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        try{
            int output = x / y;
            System.out.println(output);
        } catch(InputMismatchException ie) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}
