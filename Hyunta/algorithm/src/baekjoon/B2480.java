package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B2480 {
	static int[] dices = new int[7];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			int number = Integer.parseInt(stringTokenizer.nextToken());
			dices[number]++;
		}
		int money = getPrizeMoney();
		System.out.println(money);

	}

	private static int getPrizeMoney() {
		int maxCount = Arrays.stream(dices).max().getAsInt();
		if (maxCount == 3) {
			for (int i = 0; i < 6; i++) {
				if (dices[i + 1] == 3) {
					return 10000 + (1000 * (i + 1));
				}
			}
		}

		if (maxCount == 2) {
			for (int i = 0; i < 6; i++) {
				if (dices[i + 1] == 2) {
					return 1000 + (100 * (i + 1));
				}
			}
		}

		for (int i = 6; i > 0; i--) {
			if (dices[i] == 1) {
				return i * 100;
			}
		}
		return 0;
	}
}
