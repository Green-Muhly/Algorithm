package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> member = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            member.put(name, member.getOrDefault(name, 0) + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            String name = br.readLine();
            member.replace(name, member.get(name) - 1);
        }
        for (String name : member.keySet()) {
            if (member.get(name) == 1) {
                System.out.println(name);
                break;
            }
        }
    }
}
