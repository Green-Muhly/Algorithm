package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B16236 {
	static int n;
	static int[][] board;
	static int[] start;

	public static void main(String[] args) throws IOException {
		initData();
		while (true) {
			int i = start[0];
			int j = start[1];

		}
	}

	private static void initData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int spaceStatus = Integer.parseInt(stringTokenizer.nextToken());
				if (spaceStatus == 9) {
					start = new int[]{i, j};
					spaceStatus = 2;
				}
				board[i][j] = spaceStatus;
			}
		}
	}
}
