package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int[] nums = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int tmp = num.charAt(i) - '0';
            if (tmp == 9) {
                nums[6]++;
            } else {
                nums[tmp]++;
            }
        }
        if (nums[6] % 2 == 0) {
            nums[6] = nums[6] / 2;
        } else {
            nums[6] = (nums[6] / 2) + 1;
        }
        for (int i: nums) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}
