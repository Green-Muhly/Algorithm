package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class B4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> trees = new HashMap<>();
		int cnt = 0;
		while (true) {
			String name = br.readLine();
			if (name == null || name.length() == 0) {
				break;
			}
			trees.put(name, trees.getOrDefault(name, 0) + 1);
			cnt++;
		}
		Object[] keys = trees.keySet().toArray();
		Arrays.sort(keys);

		StringBuilder sb = new StringBuilder();
		for (Object key : keys) {
			String keyString = (String)key;
			Integer treeCount = trees.get(keyString);
			float per = (float)(treeCount * 100) / cnt;

			sb.append(keyString + " " + String.format("%.4f", per) + "\n");

		}
		System.out.println(sb);
	}
}
