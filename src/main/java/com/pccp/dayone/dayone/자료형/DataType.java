package com.pccp.dayone.자료형;

public class DataType {
    //    main 메소드
    //    main 입력 -> 키보드 Tab을 누른다
    public static void main(String[] args) {
//        "=" (할당,저장 연산자)
        int intNumber = 1;
        long longNumber = 10000000000L;

        // 문자형과 문자열 생성 차이
        // 문자형의 생성 ''
        char charVariable = 'a';
        // char charVariable2 = "b";
        // 문자열의 생성 ""
        String stringVariable = "b";

        // 비교 연산자
        // 2개의 값을 비교해서 true(참) / false(거짓)의 결과를 만드는 연산자

        // 같다(==)
        int intVariable1 = 1;
        int intVariable2 = 2;
        boolean boolVariable1 = intVariable1 == intVariable2; // false(거짓)

        // 다르다(!=)
        boolean boolVariable2 = intVariable1 != intVariable2; // true(참)

        // A > B : A가 B보다 큰가?
        // A >= B : A가 B 이상인가?
        // A < B : A가 B보다 작은가?
        // A <= B : A가 B 이하인가?

        // 논리 연산자 : AND(&&) OR(||) NOT(!)
        // not 연산자(!)
        // !true -> false / !false -> true
        // !(1 < 2); -> false

        // and 연산자(&&)
        // 좌항 && 우항
        // 좌항과 우항이 둘 다 true(참)일 때 true를 생성(반환)한다.
        // 그 밖에 false(거짓) 생성
        boolean boolVariable3 = true && true; // true
        // 비교 연산자와 함께 사용한다.
        // 비교 연산자의 우선순위가 높다.
        // 0 < a < 10 : 자바에서는 불가능(파이썬 표현)
        // 0 < a && a < 10 : 자바 표현
        boolean boolVariable4 = (1 < 10) && (1 == 1); // true

        // or 연산자(||)
        // 좌항 || 우항
        // 좌항과 우항 중 하나라도 true라면 true를 생성
        // 좌항과 우항 둘 다 false라면 false를 생성
        boolean boolVariable5 = (1 > 10) || (1 == 1); // true
        boolean boolVariable6 = (1 > 10) || (1 != 1); // false
    }
}
