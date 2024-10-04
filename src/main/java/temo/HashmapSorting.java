package temo;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashmapSorting {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Sikkim", 26);
        map.put("Amravati", 100);
        map.put("Pune", 50);
        map.put("Mumbai", 40);
        map.put("Goa", 29);
        map.put("Hyderabad", 80);
        System.out.println(map);
        HashmapSorting sort = new HashmapSorting();
        sort.sortByKeys(map);
        System.out.println(sort.sortByValues(map));
    }

    private HashMap<String, Integer> sortByValues(HashMap<String, Integer> map) {
        LinkedHashMap<String, Integer> lmap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (k1, k2) -> k1, LinkedHashMap::new
        ));
        return lmap;
    }

    private void sortByKeys(HashMap<String, Integer> map) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        System.out.println(treeMap);
    }
}
