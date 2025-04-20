package 백준.브론즈.입출력.최댓값2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] Array = new int[9][9];
        int y = 0;
        int x = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for (int j = 0; j < 9; j++) {
                Array[i][j] = Integer.parseInt(st.nextToken());

                if (Array[i][j] > max) {
                    max = Array[i][j];
                    x = i;
                    y = j;
                }

            }
        }
        System.out.println(max);
        System.out.print(x + 1);
        System.out.print(" " + (y+1));
    }
}
