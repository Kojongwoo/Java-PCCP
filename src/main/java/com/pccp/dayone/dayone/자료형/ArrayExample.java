package com.pccp.dayone.자료형;

public class ArrayExample {
    public static void main(String[] args) {
        // 정수형(int) 배열
        // 초기값이 있는 배열
        int[] numberArray = {1, 2, 3, 4, 5};

        // 길이만 지정한 배열
        int[] numberArray2 = new int[5]; // {0, 0, 0, 0, 0}

        // 배열의 길이(필드)
        // 배열.length / 문자열.length()
        int numberArrayLength = numberArray.length;
        System.out.println("배열의 길이: " + numberArrayLength);

        // 배열의 순회
        for (int i = 0; i < numberArrayLength; i++) {
            int number = numberArray[i];
            System.out.println(number);
        }

        // 향상된 for문
        // 인덱스 접근 X
        for (int number : numberArray) {
            System.out.println(number);
        }
    }
}

