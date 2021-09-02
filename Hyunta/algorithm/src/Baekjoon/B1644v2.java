package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class B1644v2 {
    static int n;
    static ArrayList<Integer> primeNumbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        findPrimeNumber(n);
        System.out.println(findContinual(primeNumbers));


    }

    private static void findPrimeNumber(int n) {
        boolean[] check = new boolean[n+1];
        for (int i = 2; i < n + 1; i++) {
            if (!check[i]) {
                for (int j = i; j < n + 1; j += i) {
                    check[j] = true;
                }
                primeNumbers.add(i);
            }
        }
    }

    private static int findContinual(ArrayList<Integer> list) {
        int lt = 0;
        int rt = 1;
        int cnt = 0;
        while (lt != primeNumbers.size()) {
            int sum = 0;
            for (int i = lt; i < rt; i++) {
                sum += primeNumbers.get(i);
            }
            if (sum < n) {
                if (rt == primeNumbers.size()) break;
                rt += 1;
            } else if (sum == n) {
                cnt += 1;
                lt += 1;
                rt += 1;
            } else if (sum > n) {
                lt += 1;
            }
        }
        return cnt;

    }
}
