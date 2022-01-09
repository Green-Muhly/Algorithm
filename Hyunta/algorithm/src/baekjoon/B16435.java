package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B16435 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int l = Integer.parseInt(stringTokenizer.nextToken());

		List<Integer> fruits = Stream.of(br.readLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());

		Collections.sort(fruits);
		for (Integer fruit : fruits) {
			if (fruit <= l) {
				l++;
			}
		}
		System.out.println(l);
	}
}
