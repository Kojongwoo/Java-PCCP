package 백준.브론즈.입출력.수정렬하기2750;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 백준에 제출 시 input.text 문 주석 처리, 입력 문 주석 제거
        BufferedReader br = new BufferedReader(new FileReader("input.text"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
