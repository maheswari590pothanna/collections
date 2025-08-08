package collection.set;

import java.util.*;

class Persons implements Comparable<Person> {
    private String name;
    private int age;
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Person other) {
        int nameComp = this.name.compareTo(other.name);
        if (nameComp != 0) return nameComp;
        return Integer.compare(this.age, other.age);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class TreeSetPersonOperations {
    public static Set<Persons> union(Set<Persons> set1, Set<Persons> set2) {
        Set<Persons> result = new TreeSet<>(set1);
        result.addAll(set2);
        return result;
    }
    public static Set<Persons> difference(Set<Persons> set1, Set<Persons> set2) {
        Set<Persons> result = new TreeSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Persons> set1 = new TreeSet<>();
        set1.add(new Persons("Alice", 30));
        set1.add(new Persons("Bob", 25));

        Set<Persons> set2 = new TreeSet<>();
        set2.add(new Persons("Bob", 25));
        set2.add(new Persons("Charlie", 35));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Persons> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Persons> diffSet = difference(set1, set2);
        System.out.println("Difference: " + diffSet);
    }
}
