package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2578 {
	static int cnt = 0;
	static int[][] visit = new int[5][5];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] board = getBoard(br);
		int[] numbers = getNumbers(br);
		for (int number : numbers) {
			cnt++;
			int[] location = board[number];
			visit[location[0]][location[1]] = 1;
			if (find_bingo() >= 3) {
				break;
			}
		}
		System.out.println(cnt);
	}

	private static int find_bingo() {
		int total = 0;
		total += checkRow();
		total += checkColumn();
		total += checkDiagonal();
		return total;
	}

	private static int checkDiagonal() {
		int bingoCount = 0;
		int rightDown = 0;
		int leftDown = 0;
		for (int i = 0; i < 5; i++) {
			rightDown += visit[i][i];
			leftDown += visit[i][4-i];
		}
		if (rightDown == 5) {
			bingoCount++;
		}
		if (leftDown == 5) {
			bingoCount++;
		}
		return bingoCount;
	}

	private static int checkColumn() {
		int bingoColumn = 0;
		for (int i = 0; i < 5; i++) {
			int check = 0;
			for (int j = 0; j < 5; j++) {
				check += visit[j][i];
			}
			if (check == 5) {
				bingoColumn++;
			}
		}
		return bingoColumn;
	}

	private static int checkRow() {
		int bingoRow = 0;
		for (int i = 0; i < 5; i++) {
			if (Arrays.stream(visit[i]).sum() == 5) {
				bingoRow++;
			}
		}
		return bingoRow;
	}

	private static int[][] getBoard(BufferedReader br) throws IOException {
		int[][] board = new int[26][2];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				board[tmp] = new int[] {i, j};
			}
		}
		return board;
	}

	private static int[] getNumbers(BufferedReader br) throws IOException {
		int[] numbers = new int[25];
		int key = 0;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				numbers[key] = Integer.parseInt(st.nextToken());
				key++;
			}
		}
		return numbers;
	}
}
