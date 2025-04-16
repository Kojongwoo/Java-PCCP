package com.pccp.day1.개념.문자열;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str1 = "";
        // 빈 StringBuilder 객체 생성
        StringBuilder sb1 = new StringBuilder();

        // 초기값이 있는 StringBuilder 객체 생성
        StringBuilder sb2 = new StringBuilder("Hello World");

        // String -> StringBuilder 생성
        String str2 = "Java";
        StringBuilder sb3 = new StringBuilder(str2);

        // 새로운 문자열을 연결할 때 효율적
        // StringBuilder.append(값)
        sb3.append(" C++");
        sb3.append(" Python");
        System.out.println(sb3);

        sb3.reverse();
        System.out.println(sb3);
    }
}
