package collection.set;

import java.util.*;

public class ClassSpecificSetBehaviour {
    public static void demonstrateSets(List<Integer> numbers) {
        Set<Integer> hashSet = new HashSet<>(numbers);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        Set<Integer> treeSet = new TreeSet<>(numbers);

        System.out.println("Input List: " + numbers);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5, 3, 5, 1, 2);
        demonstrateSets(input);
    }
}
