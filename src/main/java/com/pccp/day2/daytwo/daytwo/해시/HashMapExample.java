package com.pccp.해시;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Map -> 키(Key) - 값(Value), 2개의 타입을 명시
        // 키(Key)로 사용할 수 있는 자료형은 불변성을 가지고 있어야한다.
        // 문자열을 키(key)로 많이 활용.
        // 숫자도 키로 활용 가능
        // 기본 자료형 사용 X, 래퍼 클래스 또는 객체

        // Key : 문자열
        // Value : 정수형
        HashMap<String, Integer> map1 = new HashMap<>();

        // Key : 문자열
        // Value : 문자열
        HashMap<String, String> map2 = new HashMap<>();

        // Key - Value 추가
        // put(key, value)
        map1.put("4월", 16);
        map2.put("서경대학교", "PCCP");
        System.out.println(map1); // {4월=16}

        map1.put("4월", 15);
        System.out.println(map1); // {4월=15}

        // Key를 활용한 Value 조회
        // get(key)
        System.out.println(map2.get("서경대학교")); // PCCP

        // Key를 활용한 Value 조회
        // 만약, Key가 없으면 기본값을 반환
        // getOrDefault(key, defaultValue)
        String[] strings = {"아메리카노", "아메리카노", "카페라떼", "카페라떼", "카페라떼"};
        HashMap<String, Integer> map3 = new HashMap<>();

        for (String string : strings) {
            // {아메리카노=1}
            int value = map3.getOrDefault(string, 0); // 1
            map3.put(string, value + 1); // put(아메리카노, 1 + 1);
        }

    }
}
