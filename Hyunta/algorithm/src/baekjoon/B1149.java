package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n; i++) {
            board[i][0] = Math.min(board[i - 1][1], board[i - 1][2]) + board[i][0];
            board[i][1] = Math.min(board[i - 1][0], board[i - 1][2]) + board[i][1];
            board[i][2] = Math.min(board[i - 1][0], board[i - 1][1]) + board[i][2];
        }
        System.out.println(Math.min(Math.min(board[n-1][0], board[n-1][1]) ,board[n-1][2]));
    }
}
