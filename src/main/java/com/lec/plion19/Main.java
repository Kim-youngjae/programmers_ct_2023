package com.lec.plion19;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<Integer, Double>> map = new HashMap<>();
        map.put("홍길동", (Map<Integer, Double>) new HashMap<>().put(22, 170.5));
        map.put("홍길순", (Map<Integer, Double>) new HashMap<>().put(25, 162.4));

        System.out.printf("이름: 홍길동 나이 : %d 키 : %f2", map.get("홍길동"));

    }

}