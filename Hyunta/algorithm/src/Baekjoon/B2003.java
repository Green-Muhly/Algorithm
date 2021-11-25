package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int lt = 0;
		int rt = 0;
		int tot = 0;
		int cnt = 0;

		while (true) {
			if (tot >= m) {
				tot -= a[lt++];
			} else if (rt > n - 1) {
				break;
			} else if (tot < m) {
				tot += a[rt++];
			}
			if (tot == m) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
