package com.pccp.day2.daytwo.daytwo.이차원배열;

public class DeltaSearch2 {
    public static void main(String[] args) {
        int[][] map = {{1, 3, 5}, {2, 4, 7}, {0, 9, 10}};

        // 기준 좌표 (1, 1)에서
        int y = 1;
        int x = 1;

        // 상하좌우 값을 탐색하는데
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];
            // 경계 검사
            if (0 <= ny && ny < 3 && 0 <= nx && nx < 3) {
                // 값이 짝수면 해당 값과 좌표를 출력
                if (map[ny][nx] % 2 == 0) {
                    System.out.println(map[ny][nx]);
                    System.out.println("ny = " + ny + " nx = " + nx);
                }
            }
        }
    }
}
