package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] visited = new int[n];
        int[][] graph = new int[n][n];
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (int i = 0; i < n; i++) {
                if (graph[tmp][i] == 1 && visited[i] == 0) {
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (visited[i] == 1) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
