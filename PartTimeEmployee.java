package intern.com;

/**
 * Represents a part-time employee.
 */
public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int empId, String name, int hoursWorked, double hourlyRate) {
        super(empId, name); // using super keyword
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

