package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] liquid = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            liquid[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(liquid);

        int lt = 0;
        int rt = n - 1;
        int nearZero = liquid[lt] + liquid[rt];
        int minIndex1 = lt;
        int minIndex2 = rt;

        while (lt < rt) {
            int tmp = liquid[lt] + liquid[rt];
            if (Math.abs(tmp) < Math.abs(nearZero)) {
                nearZero = tmp;
                minIndex1 = lt;
                minIndex2 = rt;
                if (tmp == 0) {
                    break;
                }
            }
            if (tmp < 0) {
                lt++;
            } else {
                rt--;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(liquid[minIndex1] + " ").append(liquid[minIndex2]);
        System.out.println(sb);
    }
}
