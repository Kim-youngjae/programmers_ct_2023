package com.lec.plion07;

// Car.java
interface Car {

    void speedUp();
    void speedDown();

}

// RedCar.java
class RedCar implements Car {

    @Override
    public void speedUp() {
        System.out.println("3만큼 가속합니다.");
    }

    @Override
    public void speedDown() {
        System.out.println("1만큼 감속합니다.");
    }

    public void wipe(){
        System.out.println("쓱삭쓱삭");
    };

}

// YellowCar.java
class YellowCar implements Car {


    @Override
    public void speedUp() {
        System.out.println("6만큼 가속합니다.");
    }

    @Override
    public void speedDown() {
        System.out.println("2만큼 감속합니다");
    }

    public void klaxon() {
        System.out.println("빵빵");
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {

        Car bbaBang = new RedCar();

        bbaBang.speedUp(); // 3만큼 가속합니다.
        bbaBang.speedDown(); // 1만큼 감속합니다.
//        bbaBang.wipe(); // 사용불가 Car 인터페이스로 할당되었기 때문
        ((RedCar) bbaBang).wipe(); // 빠방이를 RedCar 타입으로 이용하면 wipe()를 다시 사용 가능

        bbaBang = new YellowCar();

        bbaBang.speedUp(); // 6만큼 가속합니다.
        bbaBang.speedDown(); // 2만큼 감속합니다.
//        bbaBang.klaxon(); // 사용 불가, Car 인터페이스로 할당되었기 때문
        ((YellowCar) bbaBang).klaxon(); // 빠방이를 YellowCar 타입으로 이용하면 klaxon()를 다시 사용 가능

    }

}