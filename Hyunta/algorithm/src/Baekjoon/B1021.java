package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] position = new int[m];
        for (int i = 0; i < m; i++) {
            position[i] = Integer.parseInt(st.nextToken());
        }
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            nums.add(i);
        }
        int cnt = 0;
        for (int pos : position) {
            while (true) {
                if (nums.peekFirst().equals(pos)) {
                    nums.pollFirst();
                    break;
                } else {
                    int half_idx;
                    if (nums.size() % 2 == 0) {
                        half_idx = nums.size() / 2 - 1;
                    } else {
                        half_idx = nums.size() / 2;
                    }

                    if (nums.indexOf(pos) <= half_idx) {
                        while (nums.peekFirst() != pos) {
                            nums.add(nums.pollFirst());
                            cnt++;
                        }
                    } else {
                        while (nums.peekFirst() != pos) {
                            nums.addFirst(nums.pollLast());
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
