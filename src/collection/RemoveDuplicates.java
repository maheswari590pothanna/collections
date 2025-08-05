package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Set<Integer> set = new HashSet<Integer>(list);
        ArrayList<Integer> result=new ArrayList<>(set);
        System.out.println(result);
    }
}
