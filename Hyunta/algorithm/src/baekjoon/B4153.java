package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
    public static void main(String[] args) throws IOException {
        int[] lines = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = 0;
            for (int i = 0; i < 3; i++) {
                lines[i] = Integer.parseInt(st.nextToken());
                tmp += lines[i];
            }
            if (tmp == 0) {
                break;
            }
            Arrays.sort(lines);
            if (Math.pow(lines[0], 2) + Math.pow(lines[1], 2) == Math.pow(lines[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
