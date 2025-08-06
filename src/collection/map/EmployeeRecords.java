package collection.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
public class EmployeeRecords {
        public static void main(String[] args) {
            Map<Integer, Employee> employeeMap = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n Employee Record System");
                System.out.println("1. Add Employee");
                System.out.println("2. Search Employee by ID");
                System.out.println("3. Display All Employees");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();

                        Employee emp = new Employee(name, id, dept);
                        employeeMap.put(id, emp);
                        System.out.println("Employee added.");
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = scanner.nextInt();
                        Employee found = employeeMap.get(searchId);
                        if (found != null) {
                            System.out.println("Employee Found:");
                            found.display();
                        } else {
                            System.out.println("Employee not found.");
                        }
                        break;

                    case 3:
                        if (employeeMap.isEmpty()) {
                            System.out.println("No employees to display.");
                        } else {
                            System.out.println("\nAll Employees:");
                            for (Employee e : employeeMap.values()) {
                                e.display();
                                System.out.println("-----");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);

            scanner.close();
        }
    }


