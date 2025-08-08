package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetThresholdRemoval {

    public static void removeBelowThreshold(TreeSet<Integer> set, int threshold) {
        Set<Integer> toRemove = set.headSet(threshold);
        set.removeAll(new HashSet<>(toRemove));
    }

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        int threshold = 3;
        System.out.println("Original TreeSet: " + numbers);
        removeBelowThreshold(numbers, threshold);
        System.out.println("After removal (threshold " + threshold + "): " + numbers);
    }
}

