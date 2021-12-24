package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B5397 {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] typings = br.readLine().toCharArray();
            String password = getPassword(typings);
            System.out.println(password);

        }
    }

    private static String getPassword(char[] typings) {
        sb = new StringBuilder();
        Stack<Character> lt = new Stack<>();
        Stack<Character> rt = new Stack<>();
        for (char typing : typings) {
            if (typing == '<') {
                if (!lt.isEmpty()) {
                    rt.push(lt.pop());
                }
            } else if (typing == '>') {
                if (!rt.isEmpty()) {
                    lt.push(rt.pop());
                }
            } else if (typing == '-') {
                if (!lt.isEmpty()) {
                    lt.pop();
                }
            } else {
                lt.push(typing);
            }
        }
        for (int j = 0; j < lt.size(); j++) {
            sb.append(lt.elementAt(j));
        }
        for (int j = rt.size() - 1; j >= 0; j--) {
            sb.append(rt.elementAt(j));
        }
        return sb.toString();
    }
}
