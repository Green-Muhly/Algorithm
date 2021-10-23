package Goorm;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 1);
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (int i = 0; i < 3; i++) {
//            entryList
        }

    }
}
