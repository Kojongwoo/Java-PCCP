package com.pccp.day1.개념.문자열;

public class StringMethod {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // str1 과 str2 연결 -> str3 할당(저장)
        String str3 = str1 + str2; // "Hello" + "World"
        System.out.println(str3);

        // 문자열의 길이
        System.out.println("str1 문자열 길이: " + str1.length());
        System.out.println("str3 문자열 길이: " + str3.length());

        // 문자열에서 특정 인덱스의 문자 반환
        char ch = str3.charAt(1);
        char lastCh = str3.charAt(str3.length() - 1);
        System.out.println("str3 마지막 문자: " + lastCh);

        // 문자열을 문자형 배열로 변환
        // "HelloWorld" -> {'H', 'e', 'l', 'l', 'o', ...}
        char[] chArray = str3.toCharArray();
    }
}
