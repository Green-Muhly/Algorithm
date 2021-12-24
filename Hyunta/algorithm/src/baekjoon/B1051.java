package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] graph = new char[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        int sqr = Math.min(n, m);
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = res; k < sqr; k++) {
                    if (i + k < n && j + k < m) {
                        if (graph[i][j] == graph[i][j + k] && graph[i][j] == graph[i + k][j] && graph[i][j] == graph[i + k][j + k]) {
                            res = k;
                        }
                    }
                }
            }
        }
        res++;
        System.out.println(res * res);
    }
}