package programmers;

import java.util.HashMap;

public class Photo {
	static int[] position = new int[8];
	static boolean[] visited = new boolean[8];
	static HashMap<Character, Integer> friendsMap = new HashMap<>();
	static int answer = 0;
	static String[] conditionArray;

	public int solution(int n, String[] data) {
		conditionArray = data;
		initFriends();
		permutation(0);
		return answer;
	}

	private void initFriends() {
		friendsMap.put('A', 0);
		friendsMap.put('C', 1);
		friendsMap.put('F', 2);
		friendsMap.put('J', 3);
		friendsMap.put('M', 4);
		friendsMap.put('N', 5);
		friendsMap.put('R', 6);
		friendsMap.put('T', 7);
	}

	private void permutation(int idx) {
		if (idx == 8) {
			checkPosition();
		} else {
			for (int i = 0; i < 8; i++) {
				if (!visited[i]) {
					visited[i] = true;
					position[idx] = i;
					permutation(idx + 1);
					visited[i] = false;
				}
			}
		}
	}

	private void checkPosition() {
		int source;
		int target;
		int gapCondition;
		char operator;

		for (String condition : conditionArray) {
			source = position[friendsMap.get(condition.charAt(0))];
			target = position[friendsMap.get(condition.charAt(2))];
			operator = condition.charAt(3);
			gapCondition = Character.getNumericValue(condition.charAt(4)) + 1;
			int diff = Math.abs(source - target);

			if (operator == '=' && diff != gapCondition) {
				return;
			}
			if (operator == '>' && diff <= gapCondition) {
				return;
			}
			if (operator == '<' && diff >= gapCondition) {
				return;
			}
		}
		answer++;
	}
}