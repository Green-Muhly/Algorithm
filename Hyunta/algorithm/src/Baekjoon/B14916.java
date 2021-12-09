package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int restMoney = Integer.parseInt(br.readLine());
		int coins = calculateMinCoins(restMoney);
		System.out.println(coins);
	}

	private static int calculateMinCoins(int restMoney) {
		int coin = 0;
		while (restMoney > 0) {
			if (restMoney - 5 >= 0 && (isDivideBy2(restMoney - 5) || isDivideBy5(restMoney - 5))) {
				restMoney -= 5;
			} else {
				restMoney -= 2;
			}
			coin += 1;
		}
		if (restMoney < 0) {
			return -1;
		}
		return coin;
	}

	private static boolean isDivideBy5(int money) {
		return money % 5 == 0;
	}

	private static boolean isDivideBy2(int money) {
		return money % 2 == 0;
	}
}
