package com.pccp.day2.실습문제.특별한이차원배열1;

import java.util.Arrays;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
                else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] answer = solution.solution(3);
        System.out.println(Arrays.deepToString(answer));
    }
}
