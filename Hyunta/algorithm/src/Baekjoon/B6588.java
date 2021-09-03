package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B6588 {
    static int mil = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[mil];
        Arrays.fill(check, true);
        for (int i = 0; i < mil; i++) {
            if (i < 2) {
                check[i] = false;
            }
            if (check[i]) {
                for (int j = i*2; j < mil ; j+=i) {
                    check[j] = false;
                }
            }
        }
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = 2; i <= n/2; i++) {
                if (check[i] && check[n-i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));;
                    break;
                }
            }
        }
    }
}
