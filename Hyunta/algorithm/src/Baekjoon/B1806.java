package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] seq = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 0;
        int rt = 0;
        int total = 0;
        int answer = n + 1;

        while (lt < n) {
            if (total >= s) {
                total -= seq[lt];
                lt += 1;
                answer = Math.min(answer, rt - lt + 1);
            } else {
                if (rt >= n) {
                    break;
                }
                total += seq[rt];
                rt += 1;
            }
        }

        if (answer > n) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }

    }
}
