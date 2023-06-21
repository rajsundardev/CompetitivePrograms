package com.prog;

public class MissingNumber {
    static int findMissingNumber(int[] arr, int n) {
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 6};
        int res = MissingNumber.findMissingNumber(a, a.length);
        System.out.println("Missing no are :" + res);
    }
}
