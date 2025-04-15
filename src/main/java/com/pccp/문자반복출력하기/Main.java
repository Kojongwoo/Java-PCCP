package com.pccp.문자반복출력하기;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        // my_string의 각 문자를 어떻게?
        // charAt() + length() + 반복문
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 각 문자
            for (int j = 0; j < n; j++) {
                // 각 문자를 n번 연결(append)한다.
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("hello", 3);
    }
}
