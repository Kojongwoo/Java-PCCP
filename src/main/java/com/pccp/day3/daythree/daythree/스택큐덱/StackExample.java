package com.pccp.스택큐덱;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        // Deque : 인터페이스
        // ArrayDeque : 구현체(Deque을 구현한 클래스)
        Deque<Integer> stack = new ArrayDeque<>();

        // push(값) : 값을 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pop() : 값을 제거하고 반환
        stack.pop();
        int top = stack.pop();
        System.out.println(top);

        stack.push(5);
        stack.push(6);
        // peek() : 마지막에 들어간 값(Top, 탑)을 조회
        int peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());

    }
}
