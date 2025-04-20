package com.pccp.day3.실습문제.같은숫자는싫어;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() -1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answer = solution.solution(new int[]{1,1,3,3,0,1,1,1});
        System.out.println(Arrays.toString(answer));
    }
}
