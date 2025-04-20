package com.pccp.day2.daytwo.daytwo.이차원배열;

public class DeltaSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        // 기준 좌표 : 1, 1
        int y = 1;
        int x = 1;

        // 델타 배열
        // 상하좌우 순
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        // d : 델타 배열의 값을 접근하기 위한 인덱스 역할
        for (int d = 0; d < 4; d++) {
            // 다음 탐색을 하기위한 좌표를 계산
            int ny = y + dy[d];
            int nx = x + dx[d];

            // 경계 검사
            if (0 <= ny && ny < 3 && 0 <= nx && nx < 3) {
                // 문제마다 요구하는 로직을 작성하면된다.
                // 다음 좌표의 값이 5보다 작으면 출력하는 코드
                if (matrix[ny][nx] < 5) {
                    System.out.println(matrix[ny][nx]);
                }
            }
        }
    }
}
