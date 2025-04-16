package com.pccp.day1.실습문제.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        else {
            answer = a;
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3, 3);
    }
}
