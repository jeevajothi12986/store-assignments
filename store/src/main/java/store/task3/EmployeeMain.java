package store.task3;
import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {

        //Create the list of 10 employees
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,  "Ravi",    45000, "IT"));
        employees.add(new Employee(2,  "Priya",   28000, "HR"));
        employees.add(new Employee(3,  "Karan",   52000, "IT"));
        employees.add(new Employee(4,  "Sneha",   31000, "Finance"));
        employees.add(new Employee(5,  "Arjun",   27000, "HR"));
        employees.add(new Employee(6,  "Meena",   60000, "Finance"));
        employees.add(new Employee(7,  "Vikram",  35000, "IT"));
        employees.add(new Employee(8,  "Divya",   29000, "HR"));
        employees.add(new Employee(9,  "Suresh",  41000, "Finance"));
        employees.add(new Employee(10, "Lakshmi", 38000, "IT"));

        //First : Salary > 30000
        System.out.println("===== Employees with Salary > 30000 =====");
        for (Employee e : employees) {
            if (e.salary > 30000) {
                System.out.println(e);
            }
        }

        // Second : Group by Department
        System.out.println("\n===== Employees Grouped by Department =====");

        // Get unique department names first
        Set<String> departments = new HashSet<>();
        for (Employee e : employees) {
            departments.add(e.department);
        }

        // For each department, print its employees
        for (String dept : departments) {
            System.out.println("\n[ " + dept + " ]");
            for (Employee e : employees) {
                if (e.department.equals(dept)) {
                    System.out.println("  " + e);
                }
            }
        }

        // Third : Sort by name
        System.out.println("\n===== Employees Sorted by Name =====");

        // Sort the list alphabetically by name
        employees.sort(Comparator.comparing(e -> e.name));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
