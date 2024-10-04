package temo;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceCount {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("insert the string :");
        String str = "testtsts";
        CharOccuranceCount obj = new CharOccuranceCount();
        obj.calculateCount(str);
    }

    private void calculateCount(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            map.put(arr[i], 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}