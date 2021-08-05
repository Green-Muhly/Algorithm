package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        StringTokenizer st = new StringTokenizer(nums);

        StringBuffer sb1 = new StringBuffer(st.nextToken());
        int A = Integer.parseInt(sb1.reverse().toString());

        StringBuffer sb2 = new StringBuffer(st.nextToken());
        int B = Integer.parseInt(sb2.reverse().toString());

        if (A > B) {
            System.out.println(A);
        } else if (B > A) {
            System.out.println(B);
        }

    }
}
