package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B15565 {
	static int k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] dolls = new int[n];
		ArrayList<Integer> lions = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			dolls[i] = tmp;
			if (tmp == 1) {
				lions.add(i);
			}
		}
		int answer = getShortestLength(lions);
		System.out.println(answer);

	}

	private static int getShortestLength(ArrayList<Integer> lions) {
		int lt = 0;
		int rt = k - 1;
		int result = Integer.MAX_VALUE;
		if (lions.size() < k) {
			return -1;
		}

		while (rt < lions.size()) {
			int tmp = lions.get(rt) - lions.get(lt) + 1;
			result = Math.min(result, tmp);
			lt++;
			rt++;
		}
		return result;
	}
}
