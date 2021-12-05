package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        String location = br.readLine();
        for (int i = 0; i < n - 1; i++) {
            if (location.charAt(i) == 'E' && location.charAt(i + 1) == 'W') {
                res++;
            }
        }
        System.out.println(res);
    }
}
