package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B14467 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> cowMap = new HashMap<>();
		int move = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cowNumber = Integer.parseInt(st.nextToken());
			int location = Integer.parseInt(st.nextToken());
			if (cowMap.keySet().contains(cowNumber) && cowMap.get(cowNumber) != location) {
				move++;
			}
			cowMap.put(cowNumber, location);
		}
		System.out.println(move);
	}
}
