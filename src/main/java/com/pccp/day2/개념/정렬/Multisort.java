package com.pccp.day2.개념.정렬;

import java.util.ArrayList;
public class Multisort {
    public static void main(String[] args) {
        
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("사과");
        strings.add("바나나");
        strings.add("C++");
        strings.add("키위");

        // (길이가 다를 때) 길이를 기준으로 내림차순 정렬

        // (길이가 같을 때) 사전순으로 오름차순 정렬

        // 다중 조건 정렬 : 람다식의 비교 로직 내부에 조건문을 활용해서 정렬 조건을 작성한다.
        strings.sort((a, b) -> {
           int aLength = a.length();
           int bLength = b.length();
           
            // 길이를 기준으로 내림차순 정렬
            if (aLength != bLength) {
                return bLength - aLength;
            }
            else {
                // 사전순 오름차순 정렬
                return a.compareTo(b);
            }
        });
        System.out.println(strings);
    }
}
