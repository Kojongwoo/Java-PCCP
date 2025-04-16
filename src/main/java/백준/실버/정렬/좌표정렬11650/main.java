package 백준.실버.정렬.좌표정렬11650;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            map.put(input.nextInt(), input.nextInt());
        }
        System.out.println(map);
    }
}
