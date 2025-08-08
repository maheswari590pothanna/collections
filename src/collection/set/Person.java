package collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
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

class HashSetPersonExample {
    private Set<Person> peopleSet = new HashSet<>();

    public void addPerson(Person person) {
        peopleSet.add(person);
    }

    public boolean containsPerson(Person person) {
        return peopleSet.contains(person);
    }

    public static void main(String[] args) {
        HashSetPersonExample example = new HashSetPersonExample();

        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        example.addPerson(alice);
        example.addPerson(bob);

        System.out.println("Set: " + example.peopleSet);

        Person checkAlice = new Person("Alice", 30);
        System.out.println("Is Alice(30) in set? " + example.containsPerson(checkAlice));
    }
}

