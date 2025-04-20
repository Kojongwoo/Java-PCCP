package com.pccp.입출력;

import java.util.*;
import java.io.*;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        // 파일 입력 코드
        // 백준에 제출할 때는 사용 X
//        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 첫 번쨰줄은 숫자의 개수
         * 이후 N줄 동안 숫자
         * 5
         * 5
         * 2
         * 3
         * 4
         * 1
         */
        int N = Integer.parseInt(br.readLine()); // 5
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 배열 정렬
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            // 값 넣고, 줄 바꿈(개행)
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }
}
