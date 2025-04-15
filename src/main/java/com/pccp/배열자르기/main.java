package com.pccp.배열자르기;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 2, 3, 4, 5}, 1, 3);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " "); // 출력: 2 3 4
        }
    }
}
