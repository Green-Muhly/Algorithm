package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        if (time + min >= 60) {
            hour = (hour + (time + min) / 60) % 24;
            min = (time + min) % 60;
        } else {
            min = time + min;
        }

        System.out.println(hour + " " + min);
    }
}
