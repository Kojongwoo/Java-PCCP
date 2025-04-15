package com.pccp.dayone.제어문;

public class Loop {
    public static void main(String[] args) {
        // for문 / while문
        // 조건식 기반 for문 / 향상된 for문
        // while문 / do~while문

        // for(초기식 ; 조건식 ; 증감문) { 반복 실행할 코드 }
        // 초기식 : 반복문 조건에 활용할 변수를 초기화하는 영역
        // 조건식 : 반복 실행 할 조건을 작성하는 영역
        // 증감문 : 조건 기준 변수의 증감(+,-,*)을 작성하는 영역
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        // 반복문 동작 순서
        // 1. 최초 1회 초기식이 실행
        // 2. 조건식의 조건을 검사(true? false?)
        // 3. 조건식이 true면 내부 코드를 실행.
        // 3'. 조건식이 false면 조건문 실행을 종료.
        // 4. 내부 코드를 모두 실행하면 증감문을 실행
        // 5. 2번으로 돌아간다.

        // while(조건식){ 반복 실행 할 코드 }
        // 조건식이 true를 반환하면 코드를 반복 실행
        System.out.println("--- while문 ---");
        int a = 1; // for문 - 초기식
        while (a < 100) { // for문 - 조건식
            System.out.println(a);
            // a를 2배씩 증가
            a = a * 2; // for문 - 증감문
        }

        // while문 주의할점
        // 조건식이 false가 되는 증감문이 필수
        // 단, 무한반복를 의도하지 않은 경우에
        // while(true) {} : 무한반복문

        // 반복문을 제어하는 문법
        // break : 반복문을 강제로 종료하는 문법
        // continue : 현재 반복을 넘어가는 문법

        // 무한 반복을 조건문 + break를 활용해서 종료
        int i = 0;
        while (true) {
            // 복잡한 조건이 있다.
            // 조건이 여러개다.
            if (i > 10) {
                System.out.println(i);
                System.out.println("반복문 종료");
                break;
                // 동일 코드 블럭 break 아래 코드는 의미가 없다.
            }
            i = i + 1;
        }

        // 반복문 내에서 조건이 많을 때 필터링 용도로 사용
        // 조건1 && 조건2 && 조건3
        /*
         * if(!조건1) continue
         * if(!조건2) continue
         * if(!조건3) continue
         */
    }
}
