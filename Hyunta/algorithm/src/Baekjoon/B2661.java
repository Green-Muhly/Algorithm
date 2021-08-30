package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2661 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        backTracking("");
    }

    private static void backTracking(String num) {
        if (num.length() == n) {
            System.out.println(num);
            System.exit(0);
        }
        for (int i = 1; i < 4; i++) {
            if (check(num + i)) backTracking(num + i);
        }
        return;
    }

    private static boolean check(String s) {
        int leng = s.length() / 2;
        for (int i = 1; i <= leng; i++) {
            if (s.substring(s.length() - i).equals(s.substring(s.length() - 2 * i, s.length() - i))) {
                return false;
            }
        }
        return true;
    }
}
