package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B13164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int totalStudent = Integer.parseInt(st.nextToken());
		int totalGroup = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] studentHeights = new int[totalStudent];
		for (int i = 0; i < totalStudent; i++) {
			studentHeights[i] = Integer.parseInt(st.nextToken());
		}
		int[] diff = getDiff(studentHeights);
		Arrays.sort(diff);
		int cost = 0;
		for (int i = 0; i < totalStudent - totalGroup; i++) {
			cost += diff[i];
		}
		System.out.println(cost);
	}

	private static int[] getDiff(int[] studentHeights) {
		int[] diff = new int[studentHeights.length - 1];
		for (int i = 1; i < studentHeights.length; i++) {
			diff[i - 1] = studentHeights[i] - studentHeights[i - 1];
		}
		return diff;
	}
}
