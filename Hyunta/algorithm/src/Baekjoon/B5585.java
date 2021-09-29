package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int change = 1000 - n;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int res = 0;
        for (int i = 0; i < 6; i++) {
            if (change / coin[i] > 0) {
                res += change / coin[i];
                change = change % coin[i];
            }
        }
        System.out.println(res);
    }
}
