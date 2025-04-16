package com.pccp.day2.실습문제.이차원배열대각선순회;

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
       Solution solution = new Solution();
        int answer = solution.solution(new int[][]{{0,1,2}, {1,2,3}, {2,3,4}, {3,4,5}}, 2);
        System.out.println(answer);
    }
}