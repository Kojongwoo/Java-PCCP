package com.pccp.day3.실습문제.실습용로봇;

class Solution {
    public int[] solution(String command) {
        int[] answer = {0, 0};

        // 북 동 남 서 (시계 방향)
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int direction = 0; // 초기 방향 : 북

        for (char ch : command.toCharArray()) {
            switch (ch) {
                case 'G': // 전진
                    answer[0] += dy[direction];
                    answer[1] += dx[direction];
                    break;
                case 'B': // 후진
                    answer[0] -= dy[direction];
                    answer[1] -= dx[direction];
                    break;
                case 'L': // 왼쪽 회전: 시계 반대
                    direction = (direction + 3) % 4;
                    break;
                case 'R': // 오른쪽 회전: 시계 방향
                    direction = (direction + 1) % 4;
                    break;
            }
        }
        return new int[]{answer[1], answer[0]};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answer = solution.solution("GRGLGRG");
        System.out.println(answer);
    }
}
