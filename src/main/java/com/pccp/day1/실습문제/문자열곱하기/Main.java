package com.pccp.day1.실습문제.문자열곱하기;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.solution("string", 3);
        }
    }
}
