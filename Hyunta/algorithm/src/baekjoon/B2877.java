package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2877 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		k++;
		StringBuilder sb = new StringBuilder();

		int num = 0;
		while (k != 0) {
			num = k % 2;
			sb.append(num);
			k = k / 2;
		}
		String binary = sb.toString();

		StringBuilder result = new StringBuilder();
		for (int i = binary.length()-2; i >= 0; i--) {
			if (binary.charAt(i) == '0') {
				result.append(4);
			} else {
				result.append(7);
			}
		}
		System.out.println(result.toString());
	}
}
