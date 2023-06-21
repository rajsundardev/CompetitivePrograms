package com.prog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicatesNumber {

    //Using Stream api
    public void findDuplicateNo(int[] input) {
        // convert int[] to Integer[] using array streams
        Integer[] in = Arrays.stream(input).boxed().toArray(Integer[]::new);

        Set<Map.Entry<Integer, Long>> output = Stream.of(in).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1)
                .collect(Collectors.toSet());

        System.out.println(output);

        for (Map.Entry s : output) {
            System.out.println(s.getKey());
        }
    }

    //without stream api
    // time complexity - O(n), space complexity - O(1)
    public void findDuplicates(int[] ints) {
        int counter = 0;
        Map<Integer, Integer> output = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (output.containsKey(ints[i])) {
                counter = output.get(ints[i]);
                output.put(ints[i], counter + 1);
            } else {
                output.put(ints[i], 1);
            }

            if (!output.isEmpty()) {
                for (Map.Entry<Integer, Integer> s : output.entrySet()) {
                    if (s.getValue() > 1) {
                        System.out.print(s.getKey() + " ");
                    }
                }

            } else {
                System.out.println("No duplicates found!");
            }
        }
    }

    // time complexity - O(n), space complexity - O(1)
    // this approach will solve if the elements contains more than 1
    // and not more than 2 elements. If 3 elements will print the third elem too
    public void findDuplicateWay(int[] n) {

        for (int i = 0; i < n.length; i++) {
            n[n[i] % n.length] = n[n[i] % n.length] + n.length;

        }
        System.out.println("The repeating elements are :");

        for (int i = 0; i < n.length; i++) {
            if (n[i] >= n.length * 2) {
                System.out.println(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        FindDuplicatesNumber number = new FindDuplicatesNumber();
        int a[] = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
        number.findDuplicateNo(a);

        System.out.println();

        number.findDuplicates(a);

        System.out.println();

        number.findDuplicateWay(a);

        System.out.println("---------------");
        // find missing element
        int x[] = {1, 3, 5};
        for (int i = 1; i <= x.length; i++) {
            if (i != x[i - 1]) {
                System.out.println(i);
                break;
            }
            //else System.out.println("No missing");
            //continue;
        }
        System.out.println("----repeat no-------");
        int y[] = {1, 1, 2, 3, 3, 4, 5, 66, 6, 6, 7, 7};
        for (int i = 0; i < y.length - 1; i++) {
            if (y[i] == y[i + 1]) {
                System.out.println(y[i]);
                //break;
            }

        }
    }
}
