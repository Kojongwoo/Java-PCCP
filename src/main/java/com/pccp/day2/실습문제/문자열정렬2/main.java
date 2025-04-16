package com.pccp.day2.실습문제.문자열정렬2;
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        answer = new String(charArray);
        return answer;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Bcad");
        System.out.println(result);
    }
}