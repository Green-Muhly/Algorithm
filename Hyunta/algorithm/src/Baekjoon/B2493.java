package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] towers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
        }
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek()[1] > towers[i]) {
                    res[i] = stack.peek()[0] + 1;
                    break;
                } else {
                    stack.pop();
                }

            }

            if (stack.isEmpty()) {
                res[i] = 0;
            }
            stack.push(new int[]{i, towers[i]});
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
