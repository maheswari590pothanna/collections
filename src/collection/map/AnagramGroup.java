package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {
    public static List<List<String>> groupAnagrams(String[] args) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : args) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (map.containsKey(key))
                map.get(key).add(str);
             else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
            result.addAll(map.values());
            return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        result.forEach(t -> System.out.println(t + " "));
    }
}
