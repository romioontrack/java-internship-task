package intern.com;

/**
 * Represents a full-time employee.
 */
public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int empId, String name, double monthlySalary) {
        super(empId, name); // using super keyword
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
