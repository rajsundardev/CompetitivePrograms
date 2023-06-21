package com.prog;

import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String firstInput = sortArrayOfString(a);
        String secondInput = sortArrayOfString(b);

        if (firstInput.equalsIgnoreCase(secondInput)) {
            return true;
        } else {
            return false;
        }
    }

    private static String sortArrayOfString(String io) {

        char[] ch = io.toCharArray();
        String res = "";
        char temp;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i; j < ch.length; j++) {
                if (ch[i] >= ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            res = res + ch[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

