package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B16208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> lengthDemand = new ArrayList<>();
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			lengthDemand.add(Integer.parseInt(stringTokenizer.nextToken()));
		}
		Collections.sort(lengthDemand);
		int totalLength = lengthDemand.stream().mapToInt(Integer::intValue).sum();
		int cost = 0;
		for (Integer eachLength : lengthDemand) {
			totalLength -= eachLength;
			cost += eachLength * totalLength;
		}
		System.out.println(cost);
	}
}
