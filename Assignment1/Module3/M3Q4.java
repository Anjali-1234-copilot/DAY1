// Module 3 - Q4
// Demonstrate the difference between method overloading and method overriding.

public class Module3_Q4 {

    // Method overloading: same method name, different parameters
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Method overriding: same method signature in subclass
    static class Parent {
        void show() {
            System.out.println("Parent show method");
        }
    }

    static class Child extends Parent {
        @Override
        void show() {
            System.out.println("Child show method");
        }
    }

    public static void main(String[] args) {
        // Demonstrate method overloading
        Calculator calc = new Calculator();
        System.out.println("add(int, int): " + calc.add(2, 3));
        System.out.println("add(int, int, int): " + calc.add(2, 3, 4));

        // Demonstrate method overriding (runtime polymorphism)
        Parent p = new Child();
        p.show(); // calls Child's show method
    }
}

