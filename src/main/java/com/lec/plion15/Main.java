package com.lec.plion15;

//code.oa.gg/java8/1350
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.

class Main {
    public static void main(String[] args) {
        공통저장소<Integer> a저장소1 = new 공통저장소<>();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        공통저장소<Double> a저장소2 = new 공통저장소<>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        공통저장소<사과> a저장소3 = new 공통저장소<>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();
        System.out.println(c);

        공통저장소<Integer> test = new 공통저장소<>();

        test.getMyData(new 사과());

    }
}

class 공통저장소<T> {
    T data;

    T getData() {
        return data;
    }

    static <A> void getMyData(A data) {
        System.out.println(data.getClass().getSimpleName());
    }

    void setData(T inputedData) {
        this.data = inputedData;
    }
}

class 사과 {}