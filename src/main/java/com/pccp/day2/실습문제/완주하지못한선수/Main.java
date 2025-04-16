package com.pccp.day2.실습문제.완주하지못한선수;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            int value = map.getOrDefault(p, 0);
            map.put(p, value + 1);
        }
        for (String c : completion) {
            int value = map.get(c);
            map.put(c, value - 1);
        }
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                answer = key;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(result);
    }
}
