package com.pccp.dayone.자료형;

public class WrapperClassExample {
    public static void main(String[] args) {
        // 정수 생성
        int intVar = 1;
        Integer integerVar = 1;

        // 문자열 -> 정수형 변환
        String str = "123";
        int number = Integer.parseInt(str);
        long number2 = Long.parseLong("10000000000");

        // 문자열 -> 실수형 변환
        String str2 = "1.1";
        double number3 = Double.parseDouble(str2);

        // 정수형 -> 문자열 변환
        String str3 = String.valueOf(1);

        // 문자형 -> 문자열 변환
        String str4 = String.valueOf('a');

        // 문자형 -> 정수형 변환
        int number4 = Character.getNumericValue('0');
        // (int) '0' -> 문자 '0' 에 대한 유니코드 값을 반환;

        // 명시적 형변환
        int number5 = (int) 1.1;
        double number6 = (double) 1;

        // 래퍼 클래스의 상수
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        // Double.MAX_VALUE;
        // Long.MAX_VALUE;

    }
}
