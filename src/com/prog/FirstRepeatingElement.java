package com.prog;

import java.io.StringReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatingElement {
    static int findFirstRepeat(int[] arr, int n) {

        int result = -1;
        int[] storedValue = new int[n];

        //loop to store the value from the given array "arr"
//        for (int val = 0; val < n; val++) {
//            storedValue[arr[val]]++;
//        }
//
//        for (int check = 0; check < n; check++) {
//            if (storedValue[arr[check]] > 1) {
//                result = check + 1;
//                System.out.println(arr[check]);
//                break;
//            }
//        }

        for (int value = 0; value < n; value++) {
            storedValue[arr[value]]++; // storing the value and counting
        }

        for (int check = 0; check < n; check++) {
            if(storedValue[arr[check]] > 1) {
                result = check + 1; // find the index location
                System.out.println(arr[check]); // get the value
                break;
            }
        }
        return result;
    }

    //using java stream to find first repeated element
    public void findFirstRepeat(int[] arr) {

        //List<int[]> list = Arrays.asList(arr);
        int[] s = {1, 4, 6, 3, 5, 4, 5, 6};
        List<Integer> list = Arrays.stream(s).boxed().collect(Collectors.toList());
        Integer val = list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .findFirst().get();

        System.out.println("first repeated value : " + val);
        System.out.println("Find first repeated character ");

        String input = "rajsundar";

        OptionalInt first = input.chars().filter(iterate -> Collections.frequency(Arrays.asList(input.toCharArray()), iterate) > 1)
                .findFirst();

        System.out.println("String repeated value : " + first);



    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 5, 4, 5, 6};
        int result = findFirstRepeat(arr, arr.length);
        System.out.println("Expected Output: " + 2);
        System.out.println("The first occurrance of repeated element are: " + result);

        FirstRepeatingElement first = new FirstRepeatingElement();
        first.findFirstRepeat(arr);
    }
}
