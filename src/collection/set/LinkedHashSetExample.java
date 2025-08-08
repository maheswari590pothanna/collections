package collection.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExample {
    public static LinkedHashSet<String> removeDuplicatesPreserveOrder(List<String> items) {
        return new LinkedHashSet<>(items);
    }
    public static void main(String[] args) {

        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        LinkedHashSet<String> result = removeDuplicatesPreserveOrder(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);


    }
}
