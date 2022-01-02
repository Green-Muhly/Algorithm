package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class B1764 {
	static int n;
	static int m;
	static HashSet<String> noHearNames = new HashSet<>();
	static List<String> resultNames = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		n = Integer.parseInt(stringTokenizer.nextToken());
		m = Integer.parseInt(stringTokenizer.nextToken());
		for (int i = 0; i < n; i++) {
			noHearNames.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (noHearNames.contains(name)) {
				resultNames.add(name);
			}
		}
		System.out.println(resultNames.size());
		Collections.sort(resultNames);
		for (String resultName : resultNames) {
			System.out.println(resultName);
		}
	}
}
