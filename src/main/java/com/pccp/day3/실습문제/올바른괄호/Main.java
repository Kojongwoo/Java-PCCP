package com.pccp.day3.실습문제.올바른괄호;
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // "()()"
        // 왼쪽 괄호를 저장할 스택
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            // c가 '(' 일 때, 스택에 Push()
            if (c == '(') {
                stack.push('(');
            }
            // c가 ')' 일 때
            if (c == ')') {
                // 스택에 값이 있으면 -> 계속 진행, 스택에서 Pop()
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // 스택이 비어 있으면 -> 잘못된 괄호 문자열
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            // 스택에 값이 남아있으면 -> 잘못된 괄호 문자열
            return false;
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("()()"));
    }
}