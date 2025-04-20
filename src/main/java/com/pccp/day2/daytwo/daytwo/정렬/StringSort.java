package com.pccp.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        // 문자열을 정렬한다
        // -> 문자열 내부 문자들을 정렬한다.
        String str = "hello world";

        // 문자열 -> 문자(char) 배열
        char[] charArray = str.toCharArray();

        // 문자 "배열"은 정렬이 가능하다.
        // Arrays.sort(배열);
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        // 문자 배열 -> 문자열 변환 1
        String sortedString = new String(charArray);

        // 문자 배열 -> 문자열 변환 2
        StringBuilder sb = new StringBuilder();
        for (char ch : charArray) {
            sb.append(ch);
        }

        // 내림차순 정렬
        // 기본 자료형 배열 -> 객체(래퍼클래스) 배열
        Character[] charArray2 = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray2[i] = charArray[i];
        }

        // 내림차순 정렬
        Arrays.sort(charArray2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(charArray2));


    }
}
