package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] equation = br.readLine().toCharArray();
        double[] nums = new double[n];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            nums[i] = Float.parseFloat(br.readLine());
        }
        for (char c : equation) {
            if (Character.isLetter(c)) {
                stack.push(nums[(int) c - (int) 'A']);
            } else {
                Double b = stack.pop();
                Double a = stack.pop();
                stack.push(calculate(a, b, c));
            }
        }
        System.out.printf("%.2f", stack.pop());
    }

    static Double calculate(Double a, Double b, char operator) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            return a / b;
        } else {
            return 0.00;
        }
    }
}
