package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> seq = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            seq.add(i);
        }
        int cnt = k - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (seq.size() != 0) {
            res.add(seq.get(cnt));
            seq.remove(cnt);
            cnt += k - 1;
            if (seq.size() == 0) {
                break;
            }
            if (cnt >= seq.size()) {
                cnt = cnt % seq.size();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size() - 1) {
                sb.append(res.get(i)).append(">");
                break;
            }
            sb.append(res.get(i)).append(", ");
        }
        System.out.println(sb);
        br.close();
    }
}
