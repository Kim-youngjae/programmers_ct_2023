package com.lec.plion12;

// 내용 : 각각의 기본형 타입은 하나의 래퍼클래스를 가지고 있습니다. 래퍼클래스를 통해서 기본형 변수에 대한 자세한 정보를 알 수 있습니다.
// 문제 : 모든 기본형 타입에 대해서 래퍼클래스를 사용하여 최대값 최소값을 출력해보세요.

class Main {
    public static void main(String[] args) {
        byte b;
        System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
        System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);

        char c;
        System.out.println("char의 최소값 : " + (int) Character.MIN_VALUE);
        System.out.println("char의 최대값 : " + (int) Character.MAX_VALUE);
        c = (char) 65446;
        System.out.println("c = " + c);
        short s;
        System.out.println("short의 최소값 :" + Short.MIN_VALUE);
        System.out.println("short의 최대값 :" + Short.MAX_VALUE);

        int i;
        System.out.println("int의 최소값 : " + Integer.MIN_VALUE);
        System.out.println("int의 최대값 : " + Integer.MAX_VALUE);

        long l;
        System.out.println("long의 최소값 :" + Long.MIN_VALUE);
        System.out.println("long의 최대값 :" + Long.MAX_VALUE);


        float f;
        System.out.println("float의 최소값 :" + Float.MIN_VALUE);
        System.out.println("float의 최대값 :" + Float.MAX_VALUE);

        double d;
        System.out.println("double의 최소값 :" + Double.MIN_VALUE);
        System.out.println("double의 최대값 :" + Double.MAX_VALUE);

        boolean bl; // 1 bit

    }
}
