package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        String converted = convertString(board);
        if (converted.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(converted);
        }
    }

    private static String convertString(String words) {
        words = words.replace("XXXX", "AAAA");
        words = words.replace("XX", "BB");
        return words;
    }
}
