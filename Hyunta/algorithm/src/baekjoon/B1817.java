package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B1817 {
	static int n;
	static int m;
	static List<Integer> books;

	public static void main(String[] args) throws IOException {
		initData();
		int boxCount = calculateBoxes();
		System.out.println(boxCount);
	}

	private static int calculateBoxes() {
		if (n == 0) {
			return 0;
		}
		int boxCount = 1;
		int currentBox = 0;
		for (Integer book : books) {
			if (currentBox + book > m) {
				currentBox = 0;
				boxCount++;
			}
			currentBox += book;
		}
		return boxCount;
	}

	private static void initData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		n = Integer.parseInt(stringTokenizer.nextToken());
		m = Integer.parseInt(stringTokenizer.nextToken());
		try {
			books = Stream.of(br.readLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		} catch (Exception e) {
			books = null;
		}
	}
}
