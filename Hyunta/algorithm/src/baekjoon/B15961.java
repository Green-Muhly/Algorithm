package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] sushiBelt = new int[n];
        for (int i = 0; i < n; i++) {
            sushiBelt[i] = Integer.parseInt(br.readLine());
        }
        int[] eatenType = new int[d + 1];
        int currentType = 0;
        int answer = 0;

        for (int i = 0; i < k; i++) {
            if (eatenType[sushiBelt[i]]++ == 0) {
                currentType++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (--eatenType[sushiBelt[i]] == 0) {
                currentType--;
            }
            if (eatenType[sushiBelt[(i + k) % n]]++ == 0) {
                currentType++;
            }
            answer = Math.max(answer, eatenType[c] > 0 ? currentType : currentType + 1);
        }
        System.out.println(answer);

    }
}
