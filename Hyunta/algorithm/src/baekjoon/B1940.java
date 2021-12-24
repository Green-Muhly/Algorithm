package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] parts = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            parts[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(parts);
        int lt = 0;
        int rt = n - 1;
        int cnt = 0;
        while (lt < rt) {
            int cost = parts[lt] + parts[rt];
            if (cost > m) {
                rt--;
            } else if (cost == m) {
                lt++;
                rt--;
                cnt++;
            } else {
                lt++;
            }
        }
        System.out.println(cnt);
    }
}
