package com.baekjoon.p2588;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int[] nums = new int[3];

        System.out.println("n1 * n2 = " + (n1 * n2));

        char[] chars = String.valueOf(n2).toCharArray();

        for (char c : chars) {
            System.out.println(Integer.valueOf(c - 48));
            int i = n1 * Integer.valueOf(c - 48);
            System.out.println("i = " + i);
        }


        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

}
