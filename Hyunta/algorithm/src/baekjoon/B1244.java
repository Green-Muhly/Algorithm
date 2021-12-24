package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244 {
	private static int BOY = 1;
	private static int GIRL = 2;
	private static int[] currentSwitch;
	private static int totalSwitch;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		totalSwitch = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		currentSwitch = new int[totalSwitch];
		for (int i = 0; i < totalSwitch; i++) {
			currentSwitch[i] = Integer.parseInt(st.nextToken());
		}
		int studentCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < studentCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int gender = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			if (gender == BOY) {
				operateSwitchBoy(target);
			} else if (gender == GIRL) {
				operateSwitchGirl(target);
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < totalSwitch; i++) {
			stringBuilder.append(currentSwitch[i]).append(" ");
			if ((i + 1) % 20 == 0) {
				stringBuilder.append("\n");
			}
		}
		System.out.println(stringBuilder);

	}

	private static void operateSwitchGirl(int target) {
		target--;
		useSwitch(target);
		int lt = target - 1;
		int rt = target + 1;
		while (true) {
			if (lt < 0 || rt > totalSwitch - 1) {
				break;
			}
			if (currentSwitch[lt] == currentSwitch[rt]) {
				useSwitch(lt);
				useSwitch(rt);
			} else {
				break;
			}
			lt--;
			rt++;

		}
	}

	private static void operateSwitchBoy(int target) {
		for (int i = 0; i < totalSwitch; i++) {
			if ((i + 1) % target == 0) {
				useSwitch(i);
			}
		}
	}

	private static void useSwitch(int target) {
		currentSwitch[target] = currentSwitch[target] * (-1) + 1;
	}
}
