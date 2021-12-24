package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] prices = new Integer[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prices, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += prices[i];
        }
        System.out.println(res);
    }
}
