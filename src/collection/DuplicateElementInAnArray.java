package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 2, 5, 3, 6, 2};

        findDuplicates(nums);
    }

    public static void findDuplicates(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
