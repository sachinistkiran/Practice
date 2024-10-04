package temo;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

