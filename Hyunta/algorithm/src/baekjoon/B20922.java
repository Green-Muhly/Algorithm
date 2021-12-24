package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] seq = new int[n];
        st = new StringTokenizer(br.readLine());
        int max_val = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            seq[i] = tmp;
            max_val = Math.max(max_val, tmp);
        }
        int[] check = new int[max_val + 1];
        int lt = 0;
        int rt = 0;

        int answer = 0;
        while (rt < n) {
            if (check[seq[rt]] < k) {
                check[seq[rt]]++;
                rt++;
            } else {
                check[seq[lt]]--;
                lt++;
            }
            answer = Math.max(answer, rt - lt);
        }
        System.out.println(answer);
    }
}
