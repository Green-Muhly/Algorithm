package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B14594 {
	static int n;
	static int m;
	static List<Integer> walls;
	static List<Node> breakingWalls;

	public static void main(String[] args) throws IOException {
		initData();
		for (Node breakingWall : breakingWalls) {
			int x = breakingWall.getX();
			int y = breakingWall.getY();
			for (int i = x; i < y; i++) {
				walls.set(i, 0);
			}
		}
		int roomCount = walls.stream().mapToInt(Integer::intValue).sum();
		System.out.println(roomCount);
	}

	private static void initData() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bufferedReader.readLine());
		m = Integer.parseInt(bufferedReader.readLine());
		walls = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			walls.add(1);
		}
		breakingWalls = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x = Integer.parseInt(stringTokenizer.nextToken());
			int y = Integer.parseInt(stringTokenizer.nextToken());
			Node node = new Node(x, y);
			breakingWalls.add(node);
		}
	}

	private static class Node {
		private int x;
		private int y;

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
