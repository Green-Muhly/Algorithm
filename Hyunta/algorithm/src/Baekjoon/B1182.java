package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1182 {
    static int n,s, cnt=0;
    static int[] li;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = Integer.parseInt(st.nextToken());
        }

        Dfs(0, 0);
        if (s == 0) cnt--;

        System.out.println(cnt);


    }

    private static void Dfs(int l, int tot) {
        if (l == n) {
            if (tot == s) {
                cnt++;
            }
            return;
        }
        Dfs(l + 1, tot + li[l]);
        Dfs(l + 1, tot);
    }
}
