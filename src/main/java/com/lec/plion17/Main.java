package com.lec.plion17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Sol3().run();
    }

//    static void m2() {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> al = new ArrayList<>();
//
//        while (true) {
//            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
//            int n = sc.nextInt();
//            if (n == -1) {
//                System.out.println("입력을 종료합니다.");
//                break;
//            }
//            al.add(n);
//        }
//
//        Collections.sort(al);
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int number : al) {
//            if (sb.isEmpty() == false) {
//                sb.append(", ");
//            }
//
//            sb.append(number);
//        }
//
//        System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
//        System.out.println("프로그램을 종료합니다.");
//
//        sc.close();
//    }
//
//    static void m1() {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        while (true) {
//            System.out.print("숫자를 입력해주세요(-1 : 종료) : ");
//            int n = sc.nextInt();
//            if (n == -1) {
//                System.out.println("입력을 종료합니다.");
//                break;
//            }
//            sb.append(n + " ");
//        }
//
//        String[] strings = sb.toString().split(" ");
//        int[] arr = new int[strings.length];
//
//        for (int i = 0; i < strings.length; i++) {
//            arr[i] = Integer.valueOf(strings[i]);
//        }
//
//        Arrays.sort(arr);
//
//        System.out.print("입력한 숫자(오름차순) : ");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(arr[i] + ", ");
//            }
//        }
//
//        sc.close();
//    }
}

class Sol3 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            list.add(num);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for (int number : list) {
            if (sb.isEmpty() == false) {
                sb.append(", ");
            }

            sb.append(number);
        }

        System.out.printf("입력한 숫자(오름차순) : %s\n", sb);
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}
