package com.lec.plion11;

//code.oa.gg/java8/960
// 문제 : double 형 변수 d 에 담긴 10.5 를 float 형 변수 f에 넣어주세요. 그 반대작업도 진행해주세요.

class Main {
    public static void main(String[] args) {
        // 자바에서의 상수  1 => 00000000 00000000 00000000 00000001
        // 자바에서의 상수 1L => 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001

        int i = 1; // int 는 4바이트 즉 돌 32개 짜리
        long l = (long)i; // long 은 8바이트 즉 돌 64개 짜리
        // (int) => 110볼트를 220볼트로 변압하듯이 1을 `long 화` 하여 넣는다.

        l = i; // 이 코드는 안전하기 때문에 자동형변환이 발생합니다.
        //i = l; // 이 코드는 안전하지 않기 때문에 자동형변환이 불가능 합니다.
        System.out.println("l = " + l);
        i = (int)l; // 수동형변환 => 위험에 대한 싸인
        System.out.println("i = " + i);

        double d = 10.5;
        float f;

        // 문제 : double 형 변수 d 에 담긴 10.5 를 float 형 변수 f에 넣어주세요. 그 반대작업도 진행해주세요.
        f = (float) d;
        System.out.println("f = " + f);
        d = f; // 안전해서 자동 형변환 해줌

        System.out.println("d = " + d);
    }
}