package com.lec.plion21;

@FunctionalInterface
interface MyFunction { // 함수형 인터페이스 정의
    void run();
}

public class Main {
    public static void main(String[] args) {
        MyFunction f1 = () -> {
            System.out.println("f1.run()");
        };

        MyFunction f2 = new MyFunction() { // 익명클래스로 run()구현
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = () -> System.out.println("f3.run()");

        f1.run();
        f2.run();
        f3.run();

        execute(f3);
        execute(() -> System.out.println("f3.run()")); // 위와 동일한 문장
        MyFunction f4 = getMyFunction(); // 리턴받은 람다식을 받아 사용
        f4.run();

    }

    static void execute(MyFunction f) {
        // 매개변수 타입이 함수형 인터페이스인 변수를 받아 실행 시켜주는 메서드
        f.run();
    }

    static MyFunction getMyFunction() {
        // 반환타입이 함수형 인터페이스
//        MyFunction f = () -> {System.out.println("f3.run()");};
//        return f;
        return () -> {System.out.println("f4.run()");}; // 위 두 줄과 동일
    }
}

