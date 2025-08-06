package collection.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Phone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = scanner.nextLine();
                    phoneBook.put(nameToAdd, number);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (phoneBook.remove(nameToRemove) != null) {
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = scanner.nextLine();
                    String foundNumber = phoneBook.get(nameToSearch);
                    if (foundNumber != null) {
                        System.out.println(nameToSearch + " -> " + foundNumber);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n All Contacts:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting Phone Book.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

