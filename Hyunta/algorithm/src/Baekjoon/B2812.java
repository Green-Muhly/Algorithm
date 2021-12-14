package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B2812 {
	static int n;
	static int k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		char[] numbers = br.readLine().toCharArray();
		getMaxValue(numbers);
	}

	private static void getMaxValue(char[] numbers) {
		int delCount = k;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (delCount > 0 && !stack.empty()) {
				if (stack.peek() < Character.getNumericValue(numbers[i])) {
					stack.pop();
					delCount--;
				} else {
					break;
				}
			}
			stack.add(Character.getNumericValue(numbers[i]));
		}
		for (Integer integer : stack) {
			System.out.print(integer);
		}
	}
}
