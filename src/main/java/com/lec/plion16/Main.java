package com.lec.plion16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        while (true) {
            try {
                System.out.printf("숫자 입력칸 : ");
                a = sc.nextInt();
                sc.nextLine(); // 버퍼를 비운다.
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자만 입력하세요.");
            }
        }
        System.out.printf("입력된 숫자 : %d\n", a);

        sc.close();
    }

}
