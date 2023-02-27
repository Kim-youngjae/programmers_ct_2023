package com.pbl.level0.p120808;

public class Main {
    public static void main(String[] args) {

    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120808
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        int rDenom = 0;
        int rNumer = 0;

        if (denom1 > denom2) {
            if (denom1 % denom2 == 0) {
                rDenom = denom1; // 분모가 큰 값
                rNumer = numer1 + (numer2 * (denom1 / denom2));
            } else {
                rDenom = denom1 * denom2; // 안나눠떨어지면 서로를 곱한 값
                rNumer = (numer1 * denom2) + (numer2 * denom1);
            }
        } else if (denom2 > denom1) {
            if (denom2 % denom1 == 0) {
                rDenom = denom2; // 분모가 큰 값
                rNumer = numer2 + (numer1 * (denom2 / denom1));
            } else {
                rDenom = denom1 * denom2; // 안나눠떨어지면 서로를 곱한 값
                rNumer = (numer1 * denom2) + (numer2 * denom1);
            }
        } else { // 같으면 분자만 서로를 더 한 값
            rDenom = denom1;
            rNumer = numer1 + numer2;
        }

        answer[0] = rNumer;
        answer[1] = rDenom;

        return answer;
    }
}