package collection;

import java.util.*;

public class IntersectionOfArrays {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums1) {
            map.put(num, true);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultSet.add(num); // Only add if present in nums1
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet) {
            result[i++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 5};
        int[] nums2 = {2, 2, 3, 4};
        int[] result = findIntersection(nums1, nums2);
        System.out.println("Intersection of arrays: " + Arrays.toString(result));
    }
}


