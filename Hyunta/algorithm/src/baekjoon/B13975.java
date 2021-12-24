package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B13975 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int chapterCount;

	public static void main(String[] args) throws IOException {

		int testCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCount; i++) {
			chapterCount = Integer.parseInt(br.readLine());
			PriorityQueue<Long> pages = getPages();
			long minCost = getMinCost(pages);
			System.out.println(minCost);
		}
	}

	private static long getMinCost(PriorityQueue<Long> pages) {
		long cost = 0;
		for (int i = 0; i < chapterCount - 1; i++) {
			Long minPage1 = pages.poll();
			Long minPage2 = pages.poll();
			Long tempMin = minPage1 + minPage2;
			cost += tempMin;
			pages.add(tempMin);
		}
		return cost;
	}

	private static PriorityQueue<Long> getPages() throws IOException {
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		PriorityQueue<Long> pages = new PriorityQueue<>();
		while (stringTokenizer.hasMoreTokens()) {
			pages.add(Long.parseLong(stringTokenizer.nextToken()));
		}
		return pages;
	}
}
