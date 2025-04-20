package com.pccp.그래프;

import java.io.*;
import java.util.*;

// 무방향 인접 행렬 그래프 생성
public class MatrixExample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정점의 수 V, 간선의 수 E
        // 7 8 -> 공백으로 구분된 문자열, StringTokenizer 필요
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        // 인접 행렬, 이차원 배열
        int[][] adjMatrix = new int[V][V];

        // 간선 정보 입력
        // 출발 도착
        /*
        0 1
        0 2
        ...
        */
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            // 연결된 두 정점 v1, v2
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            // 연결된 경우 이차원 배열에서 값을 1로 수정
            // 무방향 그래프는 대칭 행렬
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1; // 이 코드만 지우면 방향 그래프 생성 방식
        }
        // 이차원 배열을 한 행씩 출력
        for (int i = 0; i < V; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }

    }
}
