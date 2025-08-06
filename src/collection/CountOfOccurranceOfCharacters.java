package collection;

import java.util.HashMap;

public class CountOfOccurranceOfCharacters {
    public static void main(String[] args) {
        String string = "maheswari is a ";
        int count;
        char ch;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (char key : map.keySet()) {
            count = map.get(key);
            System.out.println(key + ":" + count);
        }
    }
}
