package com.pccp.day1.실습문제.배열의평균값;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            answer = total / numbers.length;
        }
        return answer;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}