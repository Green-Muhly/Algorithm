package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B20300 {
	private static long[] machines;
	private static long m;
	private static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		machines = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			machines[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(machines);
		if (machines.length % 2 == 0) {
			m = calculateEvenMachine();
		} else {
			m = calculateOddMachine();
		}
		System.out.println(m);
	}

	private static long calculateOddMachine() {
		long result = 0;
		for (int i = 0; i < n / 2; i++) {
			result = Math.max(result, machines[i] + machines[n - 2 - i]);
		}
		result = Math.max(result, machines[n - 1]);
		return result;
	}

	private static long calculateEvenMachine() {
		long result = 0;
		for (int i = 0; i < n / 2; i++) {
			result = Math.max(result, machines[i] + machines[n - 1 - i]);
		}
		return result;
	}
}
