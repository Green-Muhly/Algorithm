package Baekjoon;

import java.util.Scanner;

public class B11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefix_sum = new int[n+1];
        int tmp = 0;
        for (int i = 1; i < n+1; i++) {
            tmp += nums[i-1];
            prefix_sum[i] = tmp;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(prefix_sum[b] - prefix_sum[a-1]);
        }

    }
}
