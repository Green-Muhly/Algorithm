package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B9465 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] stickers = new int[2][n];
			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					stickers[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int score = findMaxScore(n, stickers);
			System.out.println(score);
		}
	}

	private static int findMaxScore(int n, int[][] stickers) {
		if (n == 1) {
			return Math.max(stickers[0][0], stickers[1][0]);
		}
		stickers[1][1] += stickers[0][0];
		stickers[0][1] += stickers[1][0];
		for (int i = 2; i < n; i++) {
			stickers[0][i] += Math.max(stickers[1][i - 1], stickers[1][i - 2]);
			stickers[1][i] += Math.max(stickers[0][i - 1], stickers[0][i - 2]);
		}
		int answer = Math.max(stickers[0][n - 1], stickers[1][n - 1]);
		return answer;
	}

}
