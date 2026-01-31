package intern.com;

/**
 * Demonstrates runtime polymorphism in payroll processing.
 */
public class PayrollApp {

    public static void main(String[] args) {

        // Parent reference holding child objects (Polymorphism)
        Employee emp1 = new FullTimeEmployee(101, "Shashi Sharma", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Rahul Kumar", 80, 300);
        Employee emp3 = new FullTimeEmployee(103, "Anita Singh", 65000);

        Employee[] employees = { emp1, emp2, emp3 };

        System.out.println("----- Payroll Summary -----");

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: ₹" + emp.calculateSalary());
            System.out.println("----------------------------");
        }
    }
}
