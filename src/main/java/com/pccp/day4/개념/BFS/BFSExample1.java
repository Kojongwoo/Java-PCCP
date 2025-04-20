package com.pccp.day4.개념.BFS;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class BFSExample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        // 인접 리스트
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // 간선 입력 (무방향 그래프)
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // 시작 정점
        int start = 0;

        // 방문 배열 생성
        boolean[] visited = new boolean[V];
        visited[start] = true;

        // 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(' ');

            for (int next : adj.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        System.out.println(sb.toString());
    }
}