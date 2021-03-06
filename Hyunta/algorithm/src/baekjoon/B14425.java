package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            if (s.contains(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
