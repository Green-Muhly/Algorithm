package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());

		Arrays.sort(seq);
		int lt = 0;
		int rt = n - 1;
		int cnt = 0;

		while (lt < rt) {
			int tmpSum = seq[lt] + seq[rt];
			if (tmpSum > x) {
				rt--;
			} else if (tmpSum == x) {
				cnt++;
				lt++;
				rt--;
			} else {
				lt++;
			}
		}
		System.out.println(cnt);

	}
}
