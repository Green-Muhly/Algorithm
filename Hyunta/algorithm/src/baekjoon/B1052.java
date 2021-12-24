package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int res = 0;

        while (true) {
            char[] bin = Integer.toBinaryString(n).toCharArray();
            int cnt = 0;

            for (int i = 0; i < bin.length; i++) {
                if (bin[i] == '1') {
                    cnt++;
                }
            }

            if (cnt <= k) {
                System.out.println(res);
                break;
            }

            n++;
            res++;
        }
    }
}
