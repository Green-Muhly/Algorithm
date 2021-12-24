package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> q = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int[] first = q.poll();
                boolean isMax = true;

                for (int j = 0; j < q.size(); j++) {
                    if (first[1] < q.get(j)[1]) {
                        q.offer(first);
                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                cnt++;
                if (first[0] == m) {
                    break;
                }
            }
            sb.append(cnt).append('\n');

        }
        System.out.println(sb);

    }
}
