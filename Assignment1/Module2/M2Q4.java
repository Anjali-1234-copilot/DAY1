// Module 2 - Q4
// Program that uses a default constructor and a parameterized constructor
// to initialize objects of a class Student.

public class Module2_Q4 {

    static class Student {
        String name;
        int age;

        // default constructor
        Student() {
            name = "Unknown";
            age = 0;
        }

        // parameterized constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();              // default constructor
        Student s2 = new Student("Alice", 20);   // parameterized constructor

        s1.display();
        s2.display();
    }
}

