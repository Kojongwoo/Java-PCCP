package com.pccp.day2.daytwo.daytwo.이차원배열;

public class DeltaSearch3 {
    public static void main(String[] args) {
        // 한 좌표의 델타 탐색 -> 전체 좌표에서의 델타 탐색
        int[][] map = {{1, 4, 2}, {5, 3, 1}, {6, 4, 2}};

        // 전체 좌표의 상하좌우 좌표값의 합을 출력

        // 세로
        int row = map.length;
        // 가로
        int col = map[0].length;
        // 델타 배열
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                // 기준 좌표에서의 네방향 합을 저장할 변수
                int total = 0;

                for (int d = 0; d < 4; d++) {
                    int ny = y + dy[d];
                    int nx = x + dx[d];
                    if (0 <= ny && ny < row && 0 <= nx && nx < col) {
                        total = total + map[ny][nx];
                    }
                }
                System.out.println(total);
            }
        }


    }
}
