package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cntZero = 0;
        int cntOne = 0;
        if (str.charAt(0) == '0') {
            cntZero++;
        } else {
            cntOne++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (str.charAt(i) == '0') {
                    cntZero++;
                } else {
                    cntOne++;
                }
            }
        }
        System.out.println(Math.min(cntZero, cntOne));
    }
}
