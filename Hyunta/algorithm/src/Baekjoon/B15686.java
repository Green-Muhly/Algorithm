package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class B15686 {
    static int N;
    static int M;
    static int[][] arr;
    static ArrayList<Point> chicken;
    static ArrayList<Point> house;
    static int[] output;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N][N];
        result = Integer.MAX_VALUE;
        chicken = new ArrayList<>();
        house = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                if (arr[i][j] == 1) house.add(new Point(i, j));
                else if (arr[i][j] == 2) chicken.add(new Point(i, j));
            }
        }

        visited = new boolean[chicken.size()];
        output = new int[chicken.size()];

        //치킨 집 선택
        for (int i = 0; i < chicken.size(); i++) {
            visited[i] = true;
            ChickenSelection(i, 0);
            visited[i] = false;
        }
        System.out.println(result);
    }

    public static void ChickenSelection(int start, int depth) {
        output[depth] = start + 1;

        for (int i = start; i < chicken.size(); i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            ChickenSelection(i, depth + 1);
            visited[i] = false;
        }

        if (depth == M - 1) {
            int tot = 0;
            int temp;

            for (int i = 0; i < house.size(); i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < M; j++) {
                    temp = getDistance(house.get(i), chicken.get(output[j] - 1));
                    min = Math.min(min, temp);
                }
                tot += min;
            }
            result = Math.min(result, tot);
        }
    }

    public static int getDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
