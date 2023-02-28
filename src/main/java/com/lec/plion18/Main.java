package com.lec.plion18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("arr.length = " + arr.length); // 길이가 고정 더 넣으면 에러

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println("al.size() = " + al.size()); // 가변 길이
        al.add(40);
        System.out.println("al.size() = " + al.size());

    }
}
