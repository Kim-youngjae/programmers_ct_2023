package com.lec.plion04;

/**
 * 디버깅 해보며 생성자 연쇄 호출 확인해보기 예제
 */

public class Main {
    public static void main(String[] args) {
        new 청둥오리();
    }
}
/*
class Object {
    Object() {
    }
}
*/

class 생물 extends Object {
    void 호흡() {

    }
}

class 동물 extends 생물 {
    void 먹기() {

    }
}

class 오리 extends 동물 {
    void 날기() {

    }
}

class 청둥오리 extends 오리 {
    void 긴거리_이동() {

    }
}
