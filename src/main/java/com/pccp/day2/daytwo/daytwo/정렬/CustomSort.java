package com.pccp.정렬;

import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        // 정수형 ArrayList
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(20);
        integers.add(20);
        integers.add(-100);

        // 절대값 기준 정렬
        // 람다식 : 익명 메소드, 이름이 없는 일회용 메소드
        integers.sort((a, b) -> {
            // Math.abs(값) : 절대값 반환
            return Math.abs(a) - Math.abs(b); // 오름차순 정렬
        });
        System.out.println(integers);

        integers.sort((a, b) -> {
            return Math.abs(b) - Math.abs(a); // 내림차순 정렬
        });
        System.out.println(integers);

        // 값을 5로 나눈 나머지를 기준으로 오름차순 정렬
        integers.sort((a, b) -> {
            return (a % 5) - (b % 5);
        });
        System.out.println(integers);


        ArrayList<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("ABC");
        strings.add("Python");
        strings.add("apple");

        // a.compareTo(b) : 두 문자열을 비교하는 메소드

        // 문자열 정렬은 compareTo() 를 활용한다.
        strings.sort((a, b) -> {
            return a.toLowerCase().compareTo(b.toLowerCase()); // 오름차순 정렬
        });
        System.out.println(strings); // [ABC, apple, java, Python]

        // 문자열들의 길이를 기준으로 정렬한다면?
        strings.sort((a, b) -> {
            return a.length() - b.length(); // 오름차순 정렬
        });
        System.out.println(strings);

        // 정렬 기준(return)이 정수(숫자)면 -> - 연산자
        // 정렬 기준(return)이 문자열이면 -> compareTo() 메소드
        // 정렬 기준이 문자(Character)형 -> - 연산자
    }
}
