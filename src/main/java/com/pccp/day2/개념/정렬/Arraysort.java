package com.pccp.day2.개념.정렬;
import java.util.*;

public class Arraysort {
    public static void main(String[] args) {
        // int(기본 자료형) 배열
        int[] intNumber = {2, 5, 1, 2, 6, 1, 53, 2};
        String[] StringNumber = {"c", "H", "a", "G", "f", "d", "e", "B", "i"};
        // System.out.println(intNumber); // 배열 -> 참조형, 직접 출력 x / 값 출력을 위해 Arrays.toString 메소드 -> 문자열 변환
        
        // Arrays.toString(배열) : 배열 -> 문자열 변환 출력용
        // System.out.println("정렬 전 : " + Arrays.toString(intNumber));
        System.out.println("정렬 전 : " + Arrays.toString(StringNumber));
        // 배열 정렬
        // Arrays.sort(배열), 기본 오름차순 정렬
        // Arrays.sort(intNumber);
        Arrays.sort(StringNumber);
        // System.out.println("오름차순 정렬 후: " + Arrays.toString(intNumber));
        System.out.println("오름차순 정렬 후: " + Arrays.toString(StringNumber));
        // 래퍼 클래스 : 기본 자료형을 객체로 다루기 위한 클래스
        // 내림차순 정렬 -> 행동

        // 기본 자료형 배열 -> 래퍼 클래스(객체) 배열, 오름차순 및 내림차순 정렬 모두 가능
        // Integer[] integerArray = new Integer[intNumber.length];

//        for (int i = 0; i < intNumber.length; i++) {
//            integerArray[i] = intNumber[i];
//        }
        // 내림차순 정렬 : Comparator.reverseOrder
        // Arrays.sort(integerArray, Comparator.reverseOrder());
        // System.out.println("내림차순 정렬 후: " + Arrays.toString(integerArray));

        String[] stringArray = new String[StringNumber.length];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = StringNumber[i];
        }
        // 내림차순 정렬
        Arrays.sort(stringArray, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후: " + Arrays.toString(stringArray));
    }
}
