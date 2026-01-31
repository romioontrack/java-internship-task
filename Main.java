package intern.com;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. Store student objects in ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aman", 20, 85.5));
        students.add(new Student(102, "Riya", 21, 91.0));
        students.add(new Student(103, "Kunal", 22, 78.4));
        students.add(new Student(101, "Aman", 20, 85.5)); // duplicate

        // 2. Remove duplicates using Set
        Set<Student> uniqueStudents = new HashSet<>(students);
        students = new ArrayList<>(uniqueStudents);

        // 3. Use HashMap for fast lookup
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : students) {
            studentMap.put(s.id, s);
        }

        // 4. Sorting using Comparator
        students.sort(StudentComparator.byMarksDesc);

        // 5. Print formatted report
        System.out.println("\nID    Name       Age   Marks");
        System.out.println("--------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }

        // 6. Fast lookup demo
        System.out.println("\n🔍 Searching student with ID 102");
        System.out.println(studentMap.get(102));

        // 7. Filter students above 80 marks
        System.out.println("\n🎯 Students scoring above 80:");
        for (Student s : students) {
            if (s.marks > 80) {
                System.out.println(s);
            }
        }

        // 8. Collection hierarchy demo
        System.out.println("\n📚 Collection Hierarchy:");
        System.out.println("List → ArrayList");
        System.out.println("Set → HashSet");
        System.out.println("Map → HashMap");
    }
}
