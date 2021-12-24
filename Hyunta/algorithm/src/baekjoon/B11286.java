package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (tmp == 0) {
                sb.append(queue.size() == 0 ? 0 : queue.poll()).append('\n');
            } else {
                queue.add(tmp);
            }
        }
        System.out.println(sb);
    }


}
