package intern.com;

import java.util.Scanner;

public class ArrayDataAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- SINGLE DIMENSION ARRAY ----------------
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0, max = marks[0], min = marks[0];

        // Calculate sum, max, min
        for (int i = 0; i < n; i++) {
            sum += marks[i];

            if (marks[i] > max)
                max = marks[i];

            if (marks[i] < min)
                min = marks[i];
        }

        double average = (double) sum / n;

        // ---------------- MANUAL SORTING (BUBBLE SORT) ----------------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        // ---------------- FORMATTED OUTPUT ----------------
        System.out.println("\n----- Student Marks Analysis -----");
        System.out.println("Total Marks   : " + sum);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + max);
        System.out.println("Lowest Marks  : " + min);

        System.out.print("Sorted Marks  : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        // ---------------- MULTI-DIMENSIONAL ARRAY ----------------
        System.out.println("\n\n----- Class-wise Marks (2D Array) -----");

        int[][] classMarks = {
                {80, 85, 90},
                {70, 75, 78},
                {88, 92, 95}
        };

        for (int i = 0; i < classMarks.length; i++) {
            System.out.print("Class " + (i + 1) + ": ");
            for (int j = 0; j < classMarks[i].length; j++) {
                System.out.print(classMarks[i][j] + " ");
            }
            System.out.println();
        }

        // ---------------- EXCEPTION HANDLING ----------------
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(marks[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        }

        sc.close();
    }
}

