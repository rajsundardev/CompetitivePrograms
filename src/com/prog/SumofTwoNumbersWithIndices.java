package com.prog;

import java.util.Arrays;

public class SumofTwoNumbersWithIndices {

    public int[] twoSumOfIndices(int[] nums, int target) {

        int n = nums.length;
        int res[] = new int[2];

        int i = 0;
        int j = i + 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                break;
            } else if (j == n - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int target = 7;
        SumofTwoNumbersWithIndices operation = new SumofTwoNumbersWithIndices();
        int[] res = operation.twoSumOfIndices(arr, target);
        System.out.println("Sum of two indicies : " + Arrays.toString(res));

    }
}
