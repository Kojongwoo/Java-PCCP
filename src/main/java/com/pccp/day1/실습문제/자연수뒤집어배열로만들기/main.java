package com.pccp.day1.실습문제.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        // 정수형 -> 문자열
        String str = String.valueOf(n);

        // 문자열 -> StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // 문자열 순서 뒤집기
        sb.reverse(); // "54321"

        int[] result = new int[sb.length()]; // {0, 0, 0, 0, 0}

        for(int i = 0; i < sb.length(); i++ ) {
            // 각 문자열 -> 문자형
            char ch = sb.charAt(i);
            // 문자형 -> 정수형
            int number = Character.getNumericValue(ch);
            // 배열[인덱스] = 정수
            result[i] = number;
        }


        return result;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(12345));
    }
}
