package com.prog;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateFromString {
    static void countDuplicateString(String io) {
        System.out.println("------Java without stream-------");
        char[] chars = io.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            if (val.getValue() > 1) {
                System.out.println(val.getKey() + " " + val.getValue());
            }
        }

        System.out.println("----------Java 8 Stream API------------");

        Map<Character, Long> out = io.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        out.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " " + v);
            }
        });
    }

    public int missingNumber(int[] arr) {
        //missing number from Array
        int missing = 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == missing) {
                missing++;
                i = 0;
            } else {
                i++;
            }
        }
        return missing;
    }

    public static void main(String[] args) {

        CountDuplicateFromString.countDuplicateString("sunnddarrr");

        CountDuplicateFromString c = new CountDuplicateFromString();

        int[] a = {1, 2, 3, 4, 5, 7};
        System.out.println(c.missingNumber(a));
    }
}
