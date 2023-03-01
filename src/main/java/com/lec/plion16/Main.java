package com.lec.plion16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // equals() 실습
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Value)) { // 참조변수 형변환 전에는 instanceof로 확인해야 함
            return false;
        }
        Value v = (Value) o;
        return this.value == v.value;
    }
}