package com.pccp.day2.실습문제.특이한정렬;

import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};

        // 기본자료형 배열 -> 래퍼 클래스 배열 변환
        Integer[] array = new Integer[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            array[i] = numlist[i];
        }

        // 래퍼 클래스 배열 정렬
        // 1. 정수 n과 가까운 순으로 정렬(오름차순)
        //    절대값 : Math.abs(값)
        // 2. 더 큰 수를 앞에 오도록 배치(내림차순)
        Arrays.sort(array, (a, b) -> {
            int absA = Math.abs(a - n);
            int absB = Math.abs(b - n);

            // 정수 n과 가까운 순(오름차순)으로 정렬
            if(absA != absB) {
                return absA - absB;
            } else {
                // 더 큰 수를 앞에 오도록 배치(내림차순)
                return b - a;
            }
        });

        // 정렬된 래퍼 클래스 배열 -> 기본 자료형 배열 변환
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }
}

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        System.out.println(Arrays.toString(result));
    }
}
