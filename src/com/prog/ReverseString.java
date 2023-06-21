package com.prog;

import java.util.Arrays;

public class ReverseString {
    public void reverseMethod1(String s) {
        int len = s.length();
        System.out.println(len);
        char ch[] = s.toCharArray();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public void reverseMethod2(String io) {
        char ch[] = io.toCharArray();
        int left, right = 0;
        right = ch.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

        }
        System.out.print(ch);
    }

    public void reverseArrayOfString(String[] arr) {
        int n = arr.length;
        String temp = "";
        System.out.println(n / 2);
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        String str = "lovejava";
        ReverseString rev = new ReverseString();
        rev.reverseMethod1(str);
        System.out.println();
        rev.reverseMethod2(str);

        System.out.println();
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        rev.reverseArrayOfString(arr);

    }
}
