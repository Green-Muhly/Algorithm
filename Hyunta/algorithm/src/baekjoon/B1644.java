package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1644 {
    static int n;
    static ArrayList<Integer> primeNumbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        primeNumbers = findPrimeNumber(n);
        System.out.println(findContinual(primeNumbers));


    }

    private static ArrayList<Integer> findPrimeNumber(int n) {
        primeNumbers = new ArrayList<>();
        ArrayList<Boolean> check = new ArrayList<>();
        check.add(false);
        check.add(false);
        for (int i = 2; i <= n; i++) {
            check.add(true);
        }
        for (int i = 2; i < n + 1; i++) {
            if (check.get(i)) {
                primeNumbers.add(i);
                for (int j = i * 2; j < n + 1; j += i) {
                    check.set(j, false);
                }
            }
        }
        return primeNumbers;
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
