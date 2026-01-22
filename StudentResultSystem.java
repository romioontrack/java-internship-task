package intern.com;

import java.util.Scanner;

public class StudentResultSystem {

    // Method to calculate percentage
    static double calculatePercentage(int totalMarks, int subjects) {
        return (double) totalMarks / subjects;
    }

    // Method to assign grade using switch
    static char assignGrade(double percentage) {
        int gradeCategory = (int) percentage / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n----- Student Result Processing System -----");
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int subjects = 5;
            int totalMarks = 0;

            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for Subject " + i + ": ");
                int marks = sc.nextInt();

                // Validation logic
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    i--;        // repeat the same subject
                    continue;   // skip invalid input
                }
                totalMarks += marks;
            }

            double percentage = calculatePercentage(totalMarks, subjects);
            char grade = assignGrade(percentage);

            System.out.println("\n----- Result Summary -----");
            System.out.println("Student Name : " + name);
            System.out.println("Total Marks  : " + totalMarks);
            System.out.println("Percentage   : " + percentage + "%");
            System.out.println("Grade        : " + grade);

            System.out.print("\nDo you want to enter another student? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // clear buffer

            if (choice == 'N' || choice == 'n') {
                break;
            }

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using Student Result System!");
        sc.close();
    }
}
