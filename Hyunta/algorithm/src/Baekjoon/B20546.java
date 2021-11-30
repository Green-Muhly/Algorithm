package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] stockPrice = new int[14];
		for (int i = 0; i < 14; i++) {
			stockPrice[i] = Integer.parseInt(st.nextToken());
		}
		int junhyunAsset = calculateJunhyun(money, stockPrice);
		int sungminAsset = calculateSungmin(money, stockPrice);

		if (junhyunAsset > sungminAsset) {
			System.out.println("BNP");
		} else if (junhyunAsset == sungminAsset) {
			System.out.println("SAMESAME");
		} else {
			System.out.println("TIMING");
		}

	}

	private static int calculateSungmin(int money, int[] stockPrice) {
		int buySeq = 0;
		int sellSeq = 0;
		int cnt = 0;
		for (int i = 1; i < stockPrice.length; i++) {
			if (stockPrice[i] < stockPrice[i - 1]) {
				buySeq++;
				sellSeq = 0;
			} else if (stockPrice[i] == stockPrice[i - 1]) {
				sellSeq = 0;
				buySeq = 0;
			} else {
				sellSeq++;
				buySeq = 0;
			}
			if (buySeq >= 3) {
				while (money >= stockPrice[i]) {
					money -= stockPrice[i];
					cnt++;
				}
			}
			if (sellSeq >= 3) {
				money += cnt * stockPrice[i];
				cnt = 0;
			}
		}
		return money + (cnt * stockPrice[13]);
	}

	private static int calculateJunhyun(int money, int[] stockPrice) {
		int cnt = 0;
		for (int i = 0; i < 14; i++) {
			while (money >= stockPrice[i]) {
				money -= stockPrice[i];
				cnt++;
			}
		}
		return money + (cnt * stockPrice[13]);
	}

}
