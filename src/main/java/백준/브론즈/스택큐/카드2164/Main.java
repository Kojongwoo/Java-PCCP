package 백준.브론즈.스택큐.카드2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Queue<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        while (deque.size() > 1) {
           deque.poll();
           deque.offer(deque.poll());
        }
        System.out.println(deque.peek());
    }
}
