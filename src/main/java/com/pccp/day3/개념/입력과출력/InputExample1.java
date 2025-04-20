package com.pccp.day3.개념.입력과출력;
import java.io.*;

public class InputExample1 {
    public static void main(String[] args) throws IOException {
//        // 사용자의 입력 받기
//        InputStream in = System.in;
//
//        // 사용자의 입력을 문자로 변환
//        InputStreamReader rd = new InputStreamReader(in);
//
//        // 입력을 버퍼(임시 저장소)에 저장
//        BufferedReader br = new BufferedReader(rd);

        // 위 입력 과정을 한 줄로 작성함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 버퍼에서 문자열 한 줄을 읽어온다.
        // readLine() 메소드를 사용하기 위해선 예외 처리가 필
        String input = br.readLine();

        /* StringTokenizer : 한 줄에 여러 개의 값이 공백으로 구분되어 들어올 때 사용함. */

    }
}
