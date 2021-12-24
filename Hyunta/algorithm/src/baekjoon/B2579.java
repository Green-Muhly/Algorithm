package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {
    static int[] stair = new int[301];
    static int[] dp = new int[301];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stair[0];
        dp[1] = stair[1] + stair[0];
        dp[2] = Integer.max(stair[0] + stair[2], stair[1] + stair[2]);
        for (int i = 3; i < n; i++) {
            dp[i] = Integer.max(stair[i] + stair[i - 1] + dp[i - 3], stair[i] + dp[i - 2]);
        }
        System.out.println(dp[n-1]);
    }
}
