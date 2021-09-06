package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2667DFS {
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int n;
    static int[][] board;
    static boolean[][] check;
    static int cnt;
    static ArrayList<Integer> result = new ArrayList<Integer>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && !check[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    result.add(cnt);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(result.size() + "\n");
        Collections.sort(result);
        for (int x: result) {
            sb.append(x + "\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        cnt++;
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny< 0 || ny >=n) continue;
            if (board[nx][ny] == 1 && !check[nx][ny]) dfs(nx, ny);
        }

    }
}
