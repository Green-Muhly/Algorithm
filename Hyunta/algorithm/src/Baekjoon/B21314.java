package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B21314 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();

		String maxValue = getMax(target);
		String minValue = getMin(target);

		System.out.println(maxValue);
		System.out.println(minValue);
	}

	private static String getMax(String target) {
		String value = "";
		int m = 0;
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) == 'M') {
				m++;
			} else if (target.charAt(i) == 'K') {
				if (m > 0) {
					value += Long.valueOf((int)Math.pow(10, m) * 5);
				} else {
					value += "5";
				}
				m = 0;
			}
		}
		for (int i = 0; i < m; i++) {
			value += "1";
		}
		return value;
	}

	private static String getMin(String target) {
		String value = "";
		int m = 0;
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) == 'M') {
				m++;
			} else if (target.charAt(i) == 'K') {
				if (m > 0) {
					value += Long.valueOf((int)Math.pow(10, m) + 5);
				} else {
					value += "5";
				}
				m = 0;
			}
		}
		if (m > 0) {
			value += Long.valueOf((int)Math.pow(10, m - 1));
		}
		return value;
	}
}
