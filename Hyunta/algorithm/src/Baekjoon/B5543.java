package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5543 {
    static int burger = 2000;
    static int bev = 2000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(br.readLine());
            burger = Math.min(burger, tmp);
        }
        for (int i = 0; i < 2; i++) {
            int tmp = Integer.parseInt(br.readLine());
            bev = Math.min(bev, tmp);
        }
        System.out.println(burger + bev - 50);

    }
}
