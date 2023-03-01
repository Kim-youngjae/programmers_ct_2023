package com.lec.plion20;

public class Main {
    public static void main(String[] args) {
//        Object o = (a, b) -> a > b ? a : b; // 익명 객체
        /*Object o = new Object() {
            int max(int a, int b) {
                return (a, b) -> a > b ? a : b;
            }
        };*/
//        int value = o.max(3, 1); // error 함수형 인터페이스로 다루어야함

        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        MyFunction f2 = ((a, b) -> a > b ? a : b); // 위와 동일한 코드


        int value = f.max(3, 5);
        int value2 = f2.max(3, 4);
        System.out.println("value2 = " + value2);
        System.out.println("value = " + value);
    }
}

@FunctionalInterface // 함수형 인터페이스 선언 -> 단 하나의 추상 메서드만 가질 수 있음
interface MyFunction {
    public abstract int max(int a, int b);
}
