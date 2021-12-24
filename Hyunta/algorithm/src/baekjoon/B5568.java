package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B5568 {
	static int n;
	static int k;
	static int[] cards;
	static boolean[] isSelected;
	static int[] chosenNumbers;
	static Set<String> result = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		cards = new int[n];
		isSelected = new boolean[n];
		chosenNumbers = new int[k];
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(br.readLine());
		}
		permutation(0);
		System.out.println(result);
	}

	private static void permutation(int cnt) {
		if (cnt == k) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < k; i++) {
				stringBuilder.append(chosenNumbers[i]);
			}
			result.add(stringBuilder.toString());
			return;
		}

		for (int i = 0; i < n; i++) {
			if (isSelected[i]) {
				continue;
			}
			isSelected[i] = true;
			chosenNumbers[cnt] = cards[i];
			permutation(cnt + 1);
			isSelected[i] = false;
		}
	}
}
