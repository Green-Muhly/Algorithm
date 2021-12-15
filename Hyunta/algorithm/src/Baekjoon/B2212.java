package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2212 {
	static int sensorCount;
	static int centerCount;
	static List<Integer> sensorLocation = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sensorCount = Integer.parseInt(br.readLine());
		centerCount = Integer.parseInt(br.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		for (int i = 0; i < sensorCount; i++) {
			sensorLocation.add(Integer.parseInt(stringTokenizer.nextToken()));
		}
		Collections.sort(sensorLocation);
		int leastDistance = getLeastDistance();
		System.out.println(leastDistance);

	}

	private static int getLeastDistance() {
		List<Integer> distance = new ArrayList<>();
		if (centerCount >= sensorCount) {
			return 0;
		}
		for (int i = 1; i < sensorLocation.size(); i++) {
			int tempDistance = sensorLocation.get(i) - sensorLocation.get(i - 1);
			distance.add(tempDistance);
		}
		Collections.sort(distance);
		for (int i = 0; i < centerCount-1; i++) {
			distance.remove(distance.size() - 1);
		}
		return distance.stream().mapToInt(i -> i).sum();
	}
}
