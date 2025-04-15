package com.pccp.배열원소의길이;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]  result = solution.solution(new String[]{"We","are","the","world!"});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
