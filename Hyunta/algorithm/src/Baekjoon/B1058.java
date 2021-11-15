package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] friends = new char[n][n];
        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            friends[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (friends[j][k] == 'Y' || (friends[j][i] == 'Y' && friends[i][k] == 'Y')) {
                        visited[j][k] = 1;
                    }
                }
            }
        }

        int res = 0;
        for (int[] visit : visited) {
            res = Math.max(Arrays.stream(visit).sum(), res);
        }
        System.out.println(res);

    }
}
