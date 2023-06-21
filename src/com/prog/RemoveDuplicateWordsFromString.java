package com.prog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromString {
    static void removeDuplicateword(String io) {
        String[] input = io.split(" ");

        String output = Arrays.stream(input)
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.println("Output:: \n" + output);
    }

    public void removeDuplicateCharacterFromString(String io) {
        char[] chars = io.toLowerCase().toCharArray();

        String newstr = new String();
        for (int i = 0; i < chars.length; i++) {
            char charposition = io.charAt(i);


            if (newstr.indexOf(charposition) < 0) {
                newstr += charposition;
            }
        }
        System.out.println(newstr);

    }

    public void removedDuplicateUsingJavaStream(String io) {

        List<String> list = Arrays.asList(io.split(""));
        System.out.println(list);
        String output = list.stream().distinct().collect(Collectors.joining(""));

        System.out.println(output);


    }

    public static void main(String[] args) {
        String string = "i like java java coding java and hope you like coding coding too";
        removeDuplicateword(string);
        RemoveDuplicateWordsFromString dup = new RemoveDuplicateWordsFromString();
        dup.removeDuplicateCharacterFromString("rajsundar");

        //using javastream
        dup.removedDuplicateUsingJavaStream("rajsundar");
    }
}
