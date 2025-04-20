package com.pccp.day2.daytwo.daytwo.이차원배열;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // new int[세로의 길이][가로의 길이]
        // new int[행의 개수][열의 개수]

        // 2 X 3 행렬
        int[][] matrix = new int[2][3];

        // 첫 번째 행 / 첫 번째 열의 값 수정
        matrix[0][0] = 1;

        // 두 번째 행 / 세 번째 열의 값 수정
        matrix[1][2] = 99;

        System.out.println(Arrays.deepToString(matrix));

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
