package temo;

import java.util.*;

public class temp {
    public static void main(String[] args) {
        String s = "IamQAEngineer";
        temp temp = new temp();
        System.out.println("Character occurrences in descending order: " + temp.reverse(s));
    }

    public LinkedHashMap<Character, Integer> reverse(String s) {
        char[] c = s.toCharArray();
        int len = c.length;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (hm.containsKey(c[i])) {
                hm.put(c[i], hm.get(c[i]) + 1);
            } else {
                hm.put(c[i], 1);
            }
        }


        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
