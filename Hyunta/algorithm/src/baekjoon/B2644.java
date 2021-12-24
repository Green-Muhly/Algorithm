package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2644 {
    static int n;
    static int[][] graph;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        check = new int[n + 1];
        bfs(a, b);
        if (check[b] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(check[b]);
        }
    }

    private static void bfs(int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (tmp == b) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                if (graph[tmp][i] == 1 && check[i] == 0) {
                    check[i] = check[tmp] + 1;
                    queue.add(i);
                }

            }
        }
    }
}
