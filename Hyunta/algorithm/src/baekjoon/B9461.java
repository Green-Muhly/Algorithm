package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9461 {
    static long[] dp = new long[101];
    static int tmp;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            dp[i] = 1;
        }
        for (int i = 3; i < 101; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(br.readLine());
            System.out.println(dp[tmp-1]);
        }
    }
}
