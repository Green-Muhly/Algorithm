package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1003 {
    static int[] zeros = new int[41];
    static int[] ones = new int[41];
    static int tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        zeros[0] = 1;
        zeros[1] = 0;
        ones[0] = 0;
        ones[1] = 1;
        for (int i = 2; i < 41; i++) {
            zeros[i] = zeros[i - 1] + zeros[i - 2];
            ones[i] = ones[i - 1] + ones[i - 2];
        }
        for (int i = 0; i < t; i++) {
            tmp = Integer.parseInt(br.readLine());
            sb.append(zeros[tmp] + " ");
            sb.append(ones[tmp] + "\n");
        }
        System.out.println(sb);
    }
}
