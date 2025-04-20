package com.pccp.입출력;

import java.io.*; // BufferedReader
import java.util.*; // StringTokenizer

public class InputExample2 {
    public static void main(String[] args) throws IOException {
        /*
         * 5
         * 1 2 3 4 5
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열의 길이
        int n = Integer.parseInt(br.readLine());

        // n의 길이를 가진 배열 생성
        int[] arr = new int[n];

        // 공백으로 구분된 문자열 처리
        // StringTokenizer : 문자열을 분리하는 역할
        // "1 2 3 4 5" -> {"1", "2", "3", "4", "5"}
        String input = br.readLine(); // "1 2 3 4 5"
        StringTokenizer st = new StringTokenizer(input); // {"1", "2", "3", "4", "5"}

        // n번 토큰(문자열) 꺼내오기 위한 반복문
        for (int i = 0; i < n; i++) {
            // nextToken() : 토큰(문자열) 모음에서 문자열을 하나씩 꺼내온다.
            int number = Integer.parseInt(st.nextToken());
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
