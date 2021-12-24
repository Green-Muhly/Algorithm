package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B21608 {
	static int[] dx = new int[] {0, 0, -1, 1};
	static int[] dy = new int[] {-1, 1, 0, 0};
	static int n;
	static HashMap<Integer, ArrayList<Integer>> likeMap = new HashMap<>();
	static int[][] seats;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		seats = new int[n][n];
		for (int i = 0; i < n * n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int currentStudent = Integer.parseInt(st.nextToken());
			ArrayList<Integer> likeStudents = new ArrayList<>();
			for (int j = 0; j < 4; j++) {
				likeStudents.add(Integer.parseInt(st.nextToken()));
			}
			likeMap.put(currentStudent, likeStudents);
			findSeat(currentStudent, likeStudents);
		}
		int result = countScore();
		System.out.println(result);
	}

	private static void findSeat(int currentStudent, ArrayList<Integer> likeStudents) {
		int maxX = 0;
		int maxY = 0;
		int maxLike = -1;
		int maxEmpty = -1;
		int likeCnt;
		int emptyCnt;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (seats[i][j] == 0) {
					likeCnt = 0;
					emptyCnt = 0;
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if ((0 <= nx && nx < n) && (0 <= ny && ny < n)) {
							if (likeStudents.contains(seats[nx][ny])) {
								likeCnt++;
							}
							if (seats[nx][ny] == 0) {
								emptyCnt++;
							}
						}
					}
					if (maxLike < likeCnt || (maxLike == likeCnt && maxEmpty < emptyCnt)) {
						maxX = i;
						maxY = j;
						maxLike = likeCnt;
						maxEmpty = emptyCnt;
					}
				}
			}
		}
		seats[maxX][maxY] = currentStudent;
	}

	private static int countScore() {
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cnt = 0;
				ArrayList<Integer> like = likeMap.get(seats[i][j]);
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if ((0 <= nx && nx < n) && (0 <= ny && ny < n)) {
						if (like.contains(seats[nx][ny])) {
							cnt++;
						}
					}
				}
				if (cnt != 0) {
					result += Math.pow(10, cnt - 1);
				}
			}
		}
		return result;
	}
}
