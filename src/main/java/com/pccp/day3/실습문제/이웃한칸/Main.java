package com.pccp.day3.실습문제.이웃한칸;
/* 자바에서 문자열 값 비교는 ==이 아니라 .equals()를 사용한다. */

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int n = board.length;
        int m = board[0].length;
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nh = h + dh[d];
            int nw = w + dw[d];

            if (nh >= 0 && nh < n && nw >= 0 && nw < m) {
                if (board[h][w].equals(board[nh][nw])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}},1,1);
        System.out.println(result);
    }
}
