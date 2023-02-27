package com.pbl.level0.p120893;

public class Main {
    public static void main(String[] args) {
        new Solution().solution("a");
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/120893

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            int n = Integer.valueOf(my_string.charAt(i));
            if (97 <= n && n <= 122) { // 이 범위에 있으면 소문자로 판단
                String s = String.valueOf((char) (n - 32)).toUpperCase();
                sb.append(s);
            } else if (65 <= n && n <= 90) { // 이 범위에 있으면 대문자로 판단
                String s = String.valueOf((char) (n + 32)).toLowerCase();
                sb.append(s);
            }
        }

        answer = sb.toString();

        return answer;
    }
}