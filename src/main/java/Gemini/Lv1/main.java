package Gemini.Lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrHol = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());

                if (arr[i] % 2 == 1) {
                    total += arr[i];
                    arrHol.add(arr[i]);
                }
            }  else {
                    System.out.println("Error");
                    break;
            }
        }
        System.out.println("홀수의 총합은 " + total +"이고, 홀수는 각각" + Arrays.toString(arrHol));
    }
}
