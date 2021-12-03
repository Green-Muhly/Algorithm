package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int[] block = new int[w];
		int res = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < w; i++) {
			block[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < w - 1; i++) {
			int left = 0;
			int right = 0;

			for (int j = i - 1; j >= 0; j--) {
				left = Math.max(left, block[j]);
			}

			for (int j = i + 1; j < w; j++) {
				right = Math.max(right, block[j]);
			}
			if (left < block[i] || right < block[i]) {
				continue;
			}
			res += Math.min(left, right) - block[i];
		}
		System.out.println(res);
	}
}
