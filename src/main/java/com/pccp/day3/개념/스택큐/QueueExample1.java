package com.pccp.day3.개념.스택큐;
// 큐 : FIFO : First In First Out
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("큐 상태: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("큐 크기: " + queue.size());
        System.out.println("큐 상태: " + queue);
    }
}
