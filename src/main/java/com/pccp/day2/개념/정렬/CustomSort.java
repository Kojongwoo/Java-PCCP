package com.pccp.day2.개념.정렬;
import java.util.*;
public class CustomSort {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(-1);
//        integers.add(20);
//        integers.add(-100);
//        integers.add(20);
//        // 람다식 : 익명 메소드, 이름이 없는 간단한 일회용 메소드
//        integers.sort((a, b) -> {
//            return Math.abs(a) - Math.abs(b);
//        }); // 오름차순 정렬
//        System.out.println("절댓값 기준 오름차순 정렬: " + integers);
//
//        integers.sort((a, b) -> {
//            return Math.abs(b) - Math.abs(a);
//        }); // 내림차순 정렬
//        System.out.println("절댓값 기준 내림차순 정렬 : " + integers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("ABC");
        strings.add("Python");
        strings.add("apple");
        
        // 문자열 정렬은 compareTo()를 활용한다.
        strings.sort((a, b) -> {
            return a.toLowerCase().compareTo(b.toLowerCase());  // 오름차순 정렬
        });
        System.out.println(strings);
        
        // 문자열들의 길이를 기준으로 정렬
        strings.sort((a, b) -> {
           return a.length() - b.length(); 
        });
        System.out.println(strings);
    }
}