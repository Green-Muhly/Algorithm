package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B16162 {
	static int n;
	static int a;
	static int d;
	static List<Integer> sound;

	public static void main(String[] args) throws IOException {
		initData();
		int seq = 0;
		int currentSound = 0;
		for (Integer note : sound) {
			if (isInitValue(seq, note) || isNextNote(currentSound, note)) {
				seq++;
				currentSound = note;
			}
		}
		System.out.println(seq);
	}

	private static boolean isNextNote(int currentSound, Integer note) {
		return currentSound != 0 && note == currentSound + d;
	}

	private static boolean isInitValue(int seq, Integer note) {
		return note == a && seq == 0;
	}

	private static void initData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		n = Integer.parseInt(stringTokenizer.nextToken());
		a = Integer.parseInt(stringTokenizer.nextToken());
		d = Integer.parseInt(stringTokenizer.nextToken());

		sound = Stream.of(br.readLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}
}
