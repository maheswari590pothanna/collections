package collection.set;

import java.util.*;

public class SetIntersectionExample {
    public static Set<Integer> findIntersection(List<Set<Integer>> sets) {
        if (sets == null || sets.isEmpty()) {
            return Collections.emptySet();
        }
        Set<Integer> intersection = new HashSet<>(sets.get(0));
        for (int i = 1; i < sets.size(); i++) {
            intersection.retainAll(sets.get(i));
        }
        return intersection;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> setsList = Arrays.asList(set1, set2, set3);
        System.out.println("Intersection (HashSet): " + findIntersection(setsList));
        Set<Integer> lset1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> lset2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> lset3 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Intersection (LinkedHashSet): " +

                findIntersection(Arrays.asList(lset1, lset2, lset3)));

        Set<Integer> tset1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> tset2 = new TreeSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> tset3 = new TreeSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Intersection (TreeSet): " +
                findIntersection(Arrays.asList(tset1, tset2, tset3)));
    }
}


