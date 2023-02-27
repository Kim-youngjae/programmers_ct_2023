package com.lec.plion14;
// static 을 붙이면 클래스에서 객체화 없이 바로 변수나 함수(메서드)를 꺼내서 쓸 수 있다.
// 단 남용하면 안된다.
// 모든 객체에 대해서 해당 속성이 다르지 않을 경우에만 쓰세요.
class Main {
    public static void main(String[] args) {
        System.out.println(수학.PI);
        System.out.println(수학.더하기(10, 20));
    }
}
class 수학 {
    static double PI = 3.141592;
    static int 더하기(int a, int b) {
        return a + b;
    }
}