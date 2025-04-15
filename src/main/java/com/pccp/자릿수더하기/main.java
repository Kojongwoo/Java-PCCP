package com.pccp.자릿수더하기;

import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.StreamTokenizer;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(123));
    }
}