class Student {
    private static int studentCount = 0; // static variable
    private String name;

    Student(String name) {
        this.name = name;
        studentCount++;
    }

    public static int getStudentCount() { // static method
        return studentCount;
    }

    public String getName() {
        return name;
    }
}

public class M4Q6 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        System.out.println("Total students created: " + Student.getStudentCount());
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
        System.out.println("Third student: " + s3.getName());
    }
}
