package Baekjoon;

import java.io.*;
import java.util.*;

public class B1969 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, m;
	static ArrayList<String> list;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(findMostChar(i));
		}
		System.out.println(sb);
		System.out.println(findDiffCnt(sb.toString()));

	}

	static String findMostChar(int idx) {

		int alpha[] = new int[28];

		for (String str : list) {
			alpha[str.charAt(idx) - 'A']++;
		}
		int ret = 0;
		int max = 0;
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				ret = i;
			}
		}

		return String.valueOf((char)(ret + 'A'));
	}

	static int findDiffCnt(String str) {
		int ret = 0;

		for (int i = 0; i < m; i++) {
			for (String s : list) {
				if (s.charAt(i) != str.charAt(i))
					ret++;
			}
		}

		return ret;
	}
}
