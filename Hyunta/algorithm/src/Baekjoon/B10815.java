package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];


    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (binarySearch(tmp)) bw.write("1 ");
            else bw.write("0 ");
        }
        br.close();
        bw.close();

    }

    private static boolean binarySearch(int tmp) {
        int lt = 0;
        int rt = n - 1;

        while (lt <= rt) {
            int midIdx = (lt + rt) / 2;
            int mid = arr[midIdx];

            if (tmp< mid) rt = midIdx - 1;
            else if (tmp > mid) lt = midIdx + 1;
            else return true;
        }
        return false;
    }
}
