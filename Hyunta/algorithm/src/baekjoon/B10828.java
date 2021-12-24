package baekjoon;

import java.io.*;
import java.util.Stack;

public class B10828 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            String cons = br.readLine();

            if (cons.contains("push")) {
                String split[] = cons.split(" ");
                stack.push(Integer.parseInt(split[1]));

            } else if (cons.contains("pop")) {
                if (stack.isEmpty()) bw.write(-1 + "\n");
                else bw.write(stack.pop() + "\n");

            } else if (cons.contains("size")) {
                bw.write(stack.size() + "\n");

            } else if (cons.contains("empty")) {
                if (stack.isEmpty()) bw.write(1 + "\n");
                else bw.write(0+"\n");

            } else if (cons.contains("top")) {
                if (stack.isEmpty()) bw.write(-1 + "\n");
                else bw.write(stack.peek() + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
