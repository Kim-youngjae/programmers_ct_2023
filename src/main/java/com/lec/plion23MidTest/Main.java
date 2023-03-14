package com.lec.plion23MidTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        100000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마인가요?(인텔리제이 사용가능, 정답에 숫자만 입력)
//        System.out.println("method1() = " + method1());

//        피보나치 수열에서 50000000이하이면서 짝수인 항의 합은 얼마인가요?(인텔리제이 사용가능, 정답에 숫자만 입력)
//        System.out.println("method2() = " + method2());

//        1600851475143의 소인수 중에서 가장 큰 수를 구하세요.

    }

    private static long sol1() {
        long sum = 0L;
        for (int i = 0; i <= 100000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static long sol2() {
        final int NUMBER = 50000000;

        List<Long> list = new ArrayList<>();

        list.add(1L);
        list.add(2L);

        for (int i = 2; i < NUMBER; i++) {
            long l = list.get(i - 1) + list.get(i - 2);
            list.add(l);
            if (l % 2 == 0) {
                list.add(l);
            }
        }

        long sum = 0L;

        for (long l : list) {
            sum += l;
        }

        return sum;
    }

    static int method3() {
        long n = 1600851475143L;

        boolean[] isPrimeList = new boolean[1001];
        Arrays.fill(isPrimeList, true);

        isPrimeList[0] = false;
        isPrimeList[1] = false;

        for (int i = 2; i * i < isPrimeList.length; i++) {
            if (isPrimeList[i]) {
                for (int j = i + i; j < isPrimeList.length; j += i) {
                    //i의 배수들을 모두 false로 바꿈
                    isPrimeList[j] = false;
                }
            }
        }

        List<Integer> soinsuList = new ArrayList<>();

        for (int i = 0; i < isPrimeList.length; i++) {
            if (isPrimeList[i] == true) { // 소수이고 짝수이면
                soinsuList.add(i);
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < soinsuList.size(); i++) {
//            System.out.printf("%d / %d = %d\n", n, soinsuList.get(i), n / soinsuList.get(i));
            n /= soinsuList.get(i);
            answer.add(soinsuList.get(i));
            if (n == 0) {
                break;
            }
        }
        System.out.println("answer.toString() = " + answer.toString());

        long sum = 1;
        for (int i : answer) {
            sum *= i;
        }
        System.out.println("sum = " + sum);
        if ((long) sum == n) {
            System.out.println("같음");
        }

        return answer.get(answer.size() - 1);
    }

    public void solution() {
        int callCount = 0;

        int maxValue = -1;

        for (int i = 9999; i >= 1000; i--) {
            if ( i * i < maxValue) break; // 최적화

            for (int j = i; j >= 1000; j--) { // j = i 로 최적화
                int num = i * j;

                if (num <= maxValue) continue;  // 최적화

                if (isPalindrome(num)) {
                    maxValue = num;
                }
            }
        }

        System.out.println(callCount);

        System.out.println(maxValue);
    }

    private boolean isPalindrome(int num) {
        String numStr = num + "";

        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
