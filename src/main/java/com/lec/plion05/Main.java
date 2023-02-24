package com.lec.plion05;

class Main {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람 {

    int age;

    사람() {
        System.out.println("사람이 태어났습니다.");
    }

    사람(int age) {
        this.age = age;
        System.out.println("태어나서부터 " + this.age + "살인 사람이 태어났습니다.");
    }
}