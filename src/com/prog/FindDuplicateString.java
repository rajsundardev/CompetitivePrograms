package com.prog;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateString {
    public void findDuplicateCharacter(String str) {
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++) {
            for (int j=i+1;j<chars.length;j++) {
                if(chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    break;
                }
            }
        }
    }

    public void findDuplicateUsingStreams() {
        List<String> list = Arrays.asList("Google", "meta", "jmeta", "meta");

        Set<String> out = list.stream().filter(s-> Collections.frequency(list, s) > 1)
                        .collect(Collectors.toSet());
        System.out.println(out);
    }

    public void findDuplicateUsingSetStreams() {
        Integer intValues[] = {1,2,3,4,5,5,66,7,7,8,9,10};
        Set<Integer> set = new HashSet<>();

        // Set.add() will return false, when the item is already present.
        // Hence, we are filtering such element eventually we will get the repeated elements.
        Stream.of(intValues).filter(n-> !set.add(n))
                .collect(Collectors.toSet());

        System.out.println("DUplicate string finding using set stream: " + set);
    }


    public static void main(String[] args) {
        FindDuplicateString find = new FindDuplicateString();
        String input = "google";
        find.findDuplicateCharacter(input);

        find.findDuplicateUsingStreams();
    }
}