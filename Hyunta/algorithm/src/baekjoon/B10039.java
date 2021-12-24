package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp >= 40) {
                score += tmp;
            } else {
                score += 40;
            }
        }
        System.out.println(score / 5);
    }
}
