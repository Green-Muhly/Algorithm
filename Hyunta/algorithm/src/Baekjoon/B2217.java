package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B2217 {
    static Integer[] ropes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ropes = new Integer[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes, Collections.reverseOrder());
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = ropes[i] * (i+1);
        }
        Integer answer = Collections.max(Arrays.asList(result));
        System.out.println(answer);
    }
}
