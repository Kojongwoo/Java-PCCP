package com.pccp.day4.실습문제.게임맵최단거리;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
    public int solution(int[][] maps) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [][] map = new int[maps.length][maps[0].length];
        boolean [][] visited = new boolean[maps.length][maps[0].length];

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        visited[0][0] = true;




        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
//        System.out.println(result);
    }
}
