package com.pccp.입출력;

import java.io.*;

public class InputExample1 {
    public static void main(String[] args) throws IOException {
        // 사용자의 입력 받기
        // InputStream in = System.in;
        // 사용자의 입력을 문자로 변환
        // InputStreamReader rd = new InputStreamReader(in);
        // 입력을 버퍼(임시 저장소)에 저장
        // BufferedReader br = new BufferedReader(rd);

        // 한 줄로 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 버퍼에서 문자열 한 줄을 읽어온다.
        // readLine() 메소드를 사용하기 위해서 예외처리
        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
        int input4 = Integer.parseInt(br.readLine());

        // 숫자를 입력하고, 숫자로 활용하고 싶을 때
        // Integer.parseInt(), Double.parseDouble()
        // 문자열 -> 숫자형 변환
        int inputNumber1 = Integer.parseInt(input1);

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

    }
}

/*
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 *
 * */
