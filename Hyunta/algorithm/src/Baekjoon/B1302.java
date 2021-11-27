package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class B1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> books = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			books.put(name, books.getOrDefault(name, 0) + 1);
		}
		int maxValue = 0;
		for (String key : books.keySet()) {
			maxValue = Math.max(maxValue, books.get(key));
		}
		ArrayList<String> keys = new ArrayList<>(books.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			if (books.get(key) == maxValue) {
				System.out.println(key);
				break;
			}
		}

	}
}
