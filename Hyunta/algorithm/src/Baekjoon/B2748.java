package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2748 {

    static long[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        seq = new long[n + 1];
        seq[0] = 0;
        seq[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
        System.out.println(seq[n]);
    }
}
