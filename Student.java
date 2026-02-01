package intern.com;

public class Student {
    int id;
    String name;
    int age;
    double marks;
    

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Override equals & hashCode for Set (duplicate removal)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-10s %-5d %-6.2f", id, name, age, marks);
    }
}
