package intern.com;

import java.util.Comparator;

public class StudentComparator {

    // Sort by marks (descending)
    public static Comparator<Student> byMarksDesc =
            (s1, s2) -> Double.compare(s2.marks, s1.marks);

            
    // Sort by name
    public static Comparator<Student> byName =
            (s1, s2) -> s1.name.compareTo(s2.name);
}
