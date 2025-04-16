package com.pccp.day1.개념.문자열;

public class StringConcatPerformance {

    public static void main(String[] args) {
        int iterations = 100000;
        String testString = "";

        // 1. String '+' 연산 속도 측정
        long startTimeString = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            testString += i; // 반복마다 새로운 String 객체 생성 및 문자열 복사
        }
        long endTimeString = System.nanoTime();
        long durationString = endTimeString - startTimeString;

        System.out.println(
                "String '+' 연산 소요 시간: " + durationString);

        // 2. StringBuilder append() 속도 측정
        long startTimeBuilder = System.nanoTime();
        StringBuilder testBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            testBuilder.append(i); // 기존 StringBuilder 객체 수정
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println(
                "StringBuilder append() 소요 시간: " + durationBuilder);

    }
}