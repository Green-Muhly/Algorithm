package Programmers.Weekly;

import java.util.ArrayList;
import java.util.Arrays;

public class Week7 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 3, 4});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] enter, int[] leave) {
        ArrayList<Integer> room = new ArrayList();
        int[] met = new int[enter.length];
        Arrays.fill(met, 0);
        int tmp = 0;
        for (int l: leave) {
            while (!room.contains(l)) {
                room.add(enter[tmp]);
                tmp += 1;
            }
            room.remove(Integer.valueOf(l));
            for (int p: room) {
                met[p - 1] += 1;
            }
            met[l - 1] += room.size();
        }
        return met;
    }
}
