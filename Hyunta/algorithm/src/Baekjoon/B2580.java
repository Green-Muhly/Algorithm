package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B2580 {
    static int[][] board;
    static ArrayList<Integer> zeroX, zeroY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        board = new int[9][9];
        zeroX = new ArrayList<Integer>();
        zeroY = new ArrayList<Integer>();

        for (int x = 0; x < 9; x++) {
            String[] str = br.readLine().split(" ");
            for (int y = 0; y < 9; y++) {
                board[x][y] = Integer.parseInt(str[y]);
                if (board[x][y] == 0) {
                    zeroX.add(x);
                    zeroY.add(y);
                }
            }
        }
        backTracking(zeroX.size(), 0);
    }

    private static void backTracking(int n, int count) {
        if (count >= n) {
            printResult();
            System.exit(0);
        }

        int x = zeroX.get(count).intValue();
        int y = zeroY.get(count).intValue();
        for (int i = 1; i < 10; i++) {
            if (check(x, y, i)) {
                board[x][y] = i;
                backTracking(n, count + 1);
                board[x][y] = 0;
            }
        }
    }

    private static boolean check(int x, int y, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) {
                return false;
            }
            if (board[i][y] == num) {
                return false;
            }
        }
        int tmpX = x / 3 * 3;
        int tmpY = y / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[tmpX + i][tmpY + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printResult() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
