package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B16953 {
    static long a, b;
    static long res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        System.out.println(bfs(a, b));

    }

    public static long bfs(long x, long y) {
        res = -1;
        Queue<long[]> q = new LinkedList<>();
        q.add(new long[]{x, 1});
        while (!q.isEmpty()) {
            long[] tmp = q.poll();
            long i = tmp[0];
            long cnt = tmp[1];
            if (i == y) {
                res = cnt;
                break;
            }

            if (i * 2 <= b) {
                q.add(new long[]{i * 2, cnt + 1});
            }
            long addOne = Long.parseLong(String.valueOf(i) + '1');

            if (addOne <= b) {
                q.add(new long[]{addOne, cnt + 1});
            }
        }
        return res;
    }
}
