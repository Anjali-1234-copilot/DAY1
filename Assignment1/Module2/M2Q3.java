// Module 2 - Q3
// Demonstrate method overloading by creating multiple methods
// with the same name but different parameters.

public class Module2_Q3 {

    // add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(2, 3));
        System.out.println("add(int, int, int): " + add(2, 3, 4));
        System.out.println("add(double, double): " + add(2.5, 3.7));
    }
}

