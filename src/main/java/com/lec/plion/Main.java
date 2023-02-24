package com.lec.plion;

class 병사 {
    String 이름;
    String[] 계급 = {"이병", "일병", "상병"};
    int i = 0;
    int 공격력 = 7;

    public void 자기소개() {
        System.out.println("안녕하세요. 저는 "+ 이름 +" "+ 계급[i] +" 입니다.");
    }

    void 진급() {
        i++;
        공격력 += 2;
    }

    void 공격() {
        System.out.println(이름 +" "+ 계급[i] +"이 공격합니다.(공격력 : "+ 공격력 +")");
    }
}

abstract class 전사 {
    String 이름;
    무기 a무기;
    abstract void 공격();
}

class 홍길동 extends 전사{

    홍길동() {
        이름 = "홍길동";
        a무기 = new 칼();
    }

    @Override
    void 공격() {
        System.out.println(이름 +"이(가) "+ a무기.무기이름 +"(으)로 공격합니다.");
    }
}

class 홍길순 extends 전사 {
    홍길순() {
        이름 = "홍길순";
        a무기 = new 칼();
    }

    @Override

    void 공격() {
        System.out.println(이름 + "이(가) " + a무기.무기이름 + "(으)로 공격합니다.");
    }
}

abstract class 무기 {
    String 무기이름;
}

class 활 extends 무기 {
    활() {
        무기이름 = "활";
    }
}

class 칼 extends 무기 {
    칼() {
        무기이름 = "칼";
    }
}

class 창 extends 무기 {
    창() {
        무기이름 = "창";
    }
}

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사.a무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.a무기 = new 창();
        a전사.공격();
        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }
}
