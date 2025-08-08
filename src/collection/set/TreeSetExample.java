package collection.set;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static TreeSet<Integer> getSortedUniqueElements(List<Integer> numbers) {
        return new TreeSet<>(numbers);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 2, 9, 1, 2, 9);
        TreeSet<Integer> result = getSortedUniqueElements(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
