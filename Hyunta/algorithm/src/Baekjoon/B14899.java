package Baekjoon;

import java.util.Scanner;

public class B14899 {
    static int n;
    static boolean pick[];
    static int[][] board;
    static int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        pick = new boolean[n];
        DFS(0, 0);
        System.out.println(res);
    }

    private static void DFS(int l, int cnt) {
        if (l >= n) return;
        if (cnt == n / 2) {
            int start = 0;
            int link = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (pick[i] && pick[j]) {
                        start += board[i][j];
                    } else if (!pick[i] && !pick[j]) {
                        link += board[i][j];
                    }
                }
            }
            res = Integer.min(res, Math.abs(start - link));
        } else {
            pick[l] = true;
            DFS(l + 1, cnt + 1);
            pick[l] = false;
            DFS(l + 1, cnt);
        }

    }
}
