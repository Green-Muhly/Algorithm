package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());

        long max = Math.max(x, y);
        long min = Math.min(x, y);

        long cost1 = (x + y) * w;

        long cost2 = 0;
        if ((x + y) % 2 == 0) {
            cost2 = max * s;
        } else {
            cost2 = (max - 1) * s + w;
        }

        long cost3 = min * s + (max - min) * w;

        long ans = Math.min(Math.min(cost1, cost2), cost3);
        System.out.println(ans);

    }
}
