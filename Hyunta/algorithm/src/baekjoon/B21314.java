package baekjoon;

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
					value += "5";
					for (int j = 0; j < m; j++) {
						value += "0";
					}
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
					value += "1";
					for (int j = 0; j < m-1; j++) {
						value += "0";
					}
					value += "5";
				} else {
					value += "5";
				}
				m = 0;
			}
		}
		if (m > 0) {
			value += "1";
			for (int i = 0; i < m - 1; i++) {
				value += "0";
			}
		}
		return value;
	}
}
