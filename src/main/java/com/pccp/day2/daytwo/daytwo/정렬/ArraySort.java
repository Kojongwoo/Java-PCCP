package com.pccp.정렬;

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {

        // int(기본 자료형) 배열
        int[] intNumber = {2, 5, 1, 2, 6, 1, 53, 2};

        // Arrays.toString(배열) : 배열 -> 문자열 변환 출력용
        System.out.println(Arrays.toString(intNumber));

        // 배열 정렬
        // Arrays.sort(배열)
        Arrays.sort(intNumber);

        System.out.println(Arrays.toString(intNumber));

        // 래퍼 클래스 : 기본 자료형을 객체로 다루기 위한 클래스
        // 내림차순 정렬 -> 행동

        // 기본 자료형 배열 -> 래퍼 클래스(객체) 배열
        Integer[] integerArray = new Integer[intNumber.length];

        for (int i = 0; i < intNumber.length; i++) {
            integerArray[i] = intNumber[i];
        }

        // 객체 배열은 오름차순 정렬 / 내림차순 정렬이 가능하다.
        // 배열 오름차순 정렬
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        // 배열 내림차순 정렬
        Arrays.sort(integerArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(integerArray));
    }
}
