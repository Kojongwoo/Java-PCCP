package com.pccp.day1.개념.제어문;

public class Condition {
    public static void main(String[] args) {
        // 제어문 = 조건문 + 반복문
        // 코드의 실행을 제어한다.
        // 조건에 따라서 실행하거나 실행하지 않거나
        // 1번 실행하거나 반복해서 실행하거나

        // if~else if~else문
        int a = 10;
        int b = 100;
        int c = 1;
        // 조건식 : true/false를 생성하는 일련의 코드
        // 비교 연산자와 논리 연산자의 조합
        if (a > b) { // 조건식 false -> 내부 코드를 실행하지 못한다.
            // 중괄호 { 실행 코드 } 내부에 실행할 코드를 작성
            System.out.println("a가 b보다 크다.");
        } else if (a < b) {
            // else if : 연결된 if 또는 else if들이 false일 때 조건식을 확인합니다.
            System.out.println("a가 b보다 작다.");
        } else if (a != b) {
            System.out.println("a는 b와 다르다.");
        }

        if (a > b) {
            System.out.println("a가 b보다 크다.");
        }
        if (a < b) {
            System.out.println("a가 b보다 작다.");
        }
        if (a != b) {
            System.out.println("a는 b와 다르다.");
        } else {

        }

        // else : 연결된 if, else if가 모두 false일 때 실행되는 블럭
    }
}
