package intern.com;

/**
 * Base class representing a generic employee.
 */
public class Employee {

    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    /**
     * Calculates salary (to be overridden by subclasses).
     */
    public double calculateSalary() {
        return 0.0;
    }

    /**
     * Displays employee details.
     */
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}
