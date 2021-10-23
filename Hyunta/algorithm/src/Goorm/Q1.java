package Goorm;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        Integer[] list = new Integer[10];
        for (Integer integer : list) {
            System.out.println(integer);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.remove(Integer.valueOf(1));
        resultList.add(1);
        System.out.println(resultList);
        if (resultList.isEmpty()) {
        }
//        System.out.println(Arrays.deepToString());
    }
}
