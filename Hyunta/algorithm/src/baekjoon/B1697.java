package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1697 {
    static int n, k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] time = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (tmp == k) {
                System.out.println(time[tmp]);
                break;
            }
            for (int move : new int[]{tmp - 1, tmp + 1, tmp * 2}) {
                if ((0 <= move && move < 100001) && time[move] == 0) {
                    time[move] = time[tmp] + 1;
                    queue.add(move);
                }
            }
        }

    }
}
