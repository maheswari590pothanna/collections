package collection.map;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void findNonRepeatingCharacters(String string) {
        Map<Character, Integer> map = new HashMap<>();
        Character ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int j = 0; j < string.length(); j++) {
            ch = string.charAt(j);
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void nonRepeatingCharUsingLinkedHashmap(String string) {
        Map<Character, Integer> map = new HashMap<>();
        Character ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int j = 0; j < string.length(); j++) {
            ch = string.charAt(j);
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String string = "maheswari is a ";
        nonRepeatingCharUsingLinkedHashmap(string);
    }
}
