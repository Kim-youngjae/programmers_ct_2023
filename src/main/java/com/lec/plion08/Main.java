package com.lec.plion08;

class Main {
    public static void main(String[] args) {
        System.out.println(isHanguel('안'));
        System.out.println(isHanguel('녕'));
        System.out.println(isHanguel('하'));
        System.out.println(isHanguel('세'));
        System.out.println(isHanguel('요'));
        System.out.println(isHanguel('.'));
        // System.out.println(isHanguel('')); // 자바에서는 빈 문자열이 없다.
    }

    static boolean isHanguel(char c) {
        return c >= '가' && c <= '힣';
    }
}