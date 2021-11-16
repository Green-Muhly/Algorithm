package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Pair> balloons = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            balloons.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        while (!balloons.isEmpty()) {
            sb.append(balloons.getFirst().order + 1 + " ");
            int next = balloons.poll().next;
            if (balloons.isEmpty()) {
                break;
            }

            if (next > 0) {
                next -= 1;
                for (int i = 0; i < next; i++) {
                    balloons.addLast(balloons.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(next); i++) {
                    balloons.addFirst(balloons.pollLast());
                }
            }
        }
        System.out.println(sb);
    }

    private static class Pair {
        int order;
        int next;

        public Pair(int order, int next) {
            this.order = order;
            this.next = next;
        }
    }
}
