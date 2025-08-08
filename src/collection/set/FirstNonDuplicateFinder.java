package collection.set;

import java.util.*;

public class FirstNonDuplicateFinder {
    public static Integer findFirstNonDuplicate(List<Integer> numbers) {
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : numbers) {
            if (duplicates.contains(num)) {
                continue;
            }
            if (!unique.add(num)) {
                unique.remove(num);
                duplicates.add(num);
            }
        }
        return unique.isEmpty() ? null : unique.iterator().next();
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        Integer result = findFirstNonDuplicate(input);
        System.out.println("Input: " + input);
        System.out.println("First Non-Duplicate: " + result);
    }
}

