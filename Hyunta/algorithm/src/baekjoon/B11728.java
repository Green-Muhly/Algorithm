package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 0;
        int rt = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (true) {
            if (n <= lt) {
                for (int i = rt; i < m; i++) {
                    res.add(b[i]);
                }
                break;
            } else if (m <= rt) {
                for (int i = lt; i < n; i++) {
                    res.add(a[i]);
                }
                break;
            }
            if (a[lt] <= b[rt]) {
                res.add(a[lt]);
                lt++;
            } else {
                res.add(b[rt]);
                rt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : res) {
            sb.append(num + " ");
        }
        System.out.println(sb);

    }
}
