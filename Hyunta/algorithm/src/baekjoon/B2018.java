package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lt = 0;
        int rt = 1;
        int total = 1;
        int cnt = 0;

        while (lt < (n / 2) + 1) {
            if (total < n) {
                rt++;
                total += rt;
            } else if (total == n) {
                cnt++;
                rt++;
                total += rt;
                total -= lt;
                lt++;
            } else {
                total -= lt;
                lt++;
            }
        }
        System.out.println(cnt+1);
    }
}
