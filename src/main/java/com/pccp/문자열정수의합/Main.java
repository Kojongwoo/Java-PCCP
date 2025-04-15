package com.pccp.문자열정수의합;

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++){
            // 각 문자열 -> 문자형
            char ch = num_str.charAt(i);
            // '1' -> '2' -> '3' -> ...

            // 문자형 -> 정수형
            int number = Character.getNumericValue(ch);

            // 합 누적
            answer = answer + number;
        }

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("123456789");
    }
}
