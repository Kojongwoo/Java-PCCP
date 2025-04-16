package 프로그래머스.PCCP기출.붕대감기;
// bandage [시전 시간, 초당 회복량, 추가 회복량], attacks [공격시간, 피해량], 공격 이 끝난 후 남은 채력 => answer 리턴

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        return answer;
    }
}

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[] {5, 1, 5}, 30, new int[][]	{{2, 10}, {9, 15}, {10, 5}, {11, 5}});
        System.out.println(result);
    }
}
