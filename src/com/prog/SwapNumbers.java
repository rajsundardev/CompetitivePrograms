package com.prog;

public class SwapNumbers {

    // with 3rd variable
    public void swapNumWithThirdVariable(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
        System.out.println(first + " " + second);
    }

    // without 3rd variable
    public void swapNumWithoutThirdVariable(int first, int second) {
        int x = first;
        int y = second;
        x = x + y; // 17
        y = x - y; // 17-9 = 8
        x = x - y; // 17-8 = 9

        System.out.println(x + " " + y);

    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        swapNumbers.swapNumWithThirdVariable(10, 20);

        swapNumbers.swapNumWithoutThirdVariable(8, 9);
    }
}
