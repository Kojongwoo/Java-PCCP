package com.pccp.그래프;

import java.io.*;
import java.util.*;

public class MatrixExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        // 2차원 리스트를 만들기 위해
        // 내부 리스트 객체를 생성해서 외부 리스트에 추가
        // 정점의 수 만큼
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            // v1 -> v2 이동할 수 있다.
            adjList.get(v1).add(v2);
            // v2 -> v1 이동할 수 있다.
            adjList.get(v2).add(v1); // 삭제하면 방향 그래프 생성 방식
        }
        for (int i = 0; i < V; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(" : ").append(adjList.get(i));
            System.out.println(sb);
        }
    }
}
