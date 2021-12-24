package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15711 {
    static long primeTest[] = {2, 325, 9375, 28178, 450775, 9780504, 1795265022};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long tot = Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());
            isMate(tot);
        }
        System.out.println(sb.toString());
    }

    private static void isMate(long num) {
        if (num < 4) sb.append("NO\n");
        else if (num % 2 == 0) {
            sb.append("YES\n");
        } else {
            if (isPrime(num - 2)) sb.append("YES\n");
            else sb.append("NO\n");
        }
    }

    private static boolean isPrime(long num) {
        if (num <= Long.parseLong("10000000000")) {
            for (long i = 2; i * i <= num; i++)
                if (num % i == 0)
                    return false;
            return true;
        }
        for (long a: primeTest)
            if (!millerRabin(num,a)) return false;
        return true;
    }

    private static boolean millerRabin(long n, long a) {
        long d = n - 1;
        while (d % 2 == 0) {
            if (powMod(a, d, n) == n - 1) return true;
            d /= 2;
        }
        long tmp = powMod(a, d, n);
        return tmp == n - 1 || tmp == 1;
    }

    private static long powMod(long x, long y, long m) {
        x %= m;
        long r = 1;
        while (y > 0) {
            if (y%2 ==1) r = mulMod(r, x, m);
            x = mulMod(x, x, m);
            y /= 2;
        }
        return r;
    }

    private static long mulMod(long x, long y, long m) {
        x %= m;
        y %= m;
        long r = 0;
        while (y > 0) {
            if (y % 2 == 1) r = addMod(r, x, m);
            x = addMod(x, x, m);
            y /= 2;
        }
        return r;
    }

    private static long addMod(long x, long y, long m) {
        x %= m;
        y %= m;
        return (x >= m - y ? x - (m - y) : x + y);
    }
}
