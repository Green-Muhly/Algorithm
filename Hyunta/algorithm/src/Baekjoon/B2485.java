package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class B2485 {
    static ArrayList<Integer> trees;
    static ArrayList<Integer> distances;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        trees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            trees.add(tmp);
        }
        distances = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            distances.add(trees.get(i + 1) - trees.get(i));
        }
        int tmp = distances.get(0);
        for (int d: distances) {
            tmp = gcd(tmp, d);
        }
        int length = ((trees.get(n-1) - trees.get(0)) / tmp) + 1;
        System.out.println(length - n);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
