package com.pccp.day1.실습문제.자릿수더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(123));
    }
}