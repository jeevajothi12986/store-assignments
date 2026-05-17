package store.task3;

public class Employee {
    int id;
    String name;
    double salary;
    String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // This helps print employee details cleanly
    @Override
    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Salary: Rs." + salary +
                " | Dept: " + department;
    }
}
