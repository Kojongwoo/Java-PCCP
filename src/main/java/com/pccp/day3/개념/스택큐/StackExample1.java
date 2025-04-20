package com.pccp.day3.개념.스택큐;
// 스택 : Last In First Out
import java.util.*;

public class StackExample1 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        System.out.println("Peek: " + stack.peek()); // Top 조회
        System.out.println("Pop: " + stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("pop: " + stack.pop());
        System.out.println("스택 상태: " + stack);
    }
}
