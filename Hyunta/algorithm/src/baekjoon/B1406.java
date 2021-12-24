package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int cnt = Integer.parseInt(br.readLine());
        Stack<String> lstack = new Stack<String>();
        Stack<String> rstack = new Stack<String>();

        for (int i = 0; i < str.length(); i++) {
            lstack.push(str.substring(i, i + 1));
        }


        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comm = st.nextToken();

            if (comm.equals("L")) {
                if (lstack.isEmpty()) {
                    continue;
                } else {
                    rstack.push(lstack.pop());
                }
            } else if (comm.equals("D")) {
                if (rstack.isEmpty()) {
                    continue;
                } else {
                    lstack.push(rstack.pop());
                }
            } else if (comm.equals("B")) {
                if (lstack.isEmpty()) {
                    continue;
                } else {
                    lstack.pop();
                }
            } else if (comm.equals("P")) {
                String addend = st.nextToken();
                lstack.push(addend);
            }
        }
        for (int i = 0; i < lstack.size(); i++) {
            bw.append(lstack.get(i));
        }
        for (int i = rstack.size() - 1; i >= 0; i--) {
            bw.append(rstack.get(i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
