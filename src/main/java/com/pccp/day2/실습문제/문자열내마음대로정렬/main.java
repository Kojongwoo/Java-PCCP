package com.pccp.day2.실습문제.문자열내마음대로정렬;

import java.util.Arrays;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        // n번째 문자 : String.charAt(n) -> 오름차순
        // 사전순으로 앞선 문자열이 앞쪽에 위치 -> 오름차순
        Arrays.sort(strings, (a, b) -> {
            char aN = a.charAt(n);
            char bN = b.charAt(n);
            if (aN != bN) {
                return aN - bN;
            } else {
                return a.compareTo(b);
            }
        });

        return strings;
    }
}
public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(result));
    }
}
