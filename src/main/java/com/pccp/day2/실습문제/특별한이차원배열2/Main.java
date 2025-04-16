package com.pccp.day2.실습문제.특별한이차원배열2;

import java.util.Arrays;

class Solution {
    public int solution(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(new int[][]{{5, 192, 33}, {192,72,95}, {33, 95, 999}});
        System.out.println(answer);
    }
}
