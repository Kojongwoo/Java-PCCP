package com.pccp.day1.개념.자료형;

// ArrayList 활용을 위한 import

import java.util.*;


public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList<T> 변수명 = new ArrayList<>();
        // 문자열 ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        // 정수 ArrayList
        ArrayList<Integer> integerList = new ArrayList<>();

        // 값의 추가
        // ArrayList변수.add(값)
        integerList.add(1);
        integerList.add(2);
        stringList.add("a");
        stringList.add("b");

        // 위치 기반 값의 접근
        // ArrayList변수.get(인덱스)
        int first = integerList.get(0);

        // 위치 기반 값을 수정
        // ArrayList변수.set(인덱스, 수정 값)
        stringList.set(1, "B");

        // 리스트의 크기(길이, 요소의 개수)
        // ArrayList변수.size()
        int listSize = integerList.size();

        // 인덱스 기반 for문 코드 작성
        // 반복문 내에서 각 값을 하나씩 출력 코드 작성
        for (int i = 0; i < listSize; i++) {
            int el = integerList.get(i);
            System.out.println(el);
        }

        // 특정 값이 리스트에 포함되어 있는지 검사
        // ArrayList변수.contains(값)
        System.out.println(stringList.contains("b"));

        // 배열 -> ArrayList
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        // ArrayList -> 배열
        int[] array2 = new int[list.size()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = list.get(i);
        }
    }
}
