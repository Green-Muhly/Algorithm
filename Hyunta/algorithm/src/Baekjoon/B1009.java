package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a, b, n;
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            n = a % 10;
            for (int i = 1; i < b; i++) {
                n = (n * a) % 10;
            }
            if (n == 0) {
                System.out.println(10);
            } else {
                System.out.println(n);
            }
        }

    }
}
