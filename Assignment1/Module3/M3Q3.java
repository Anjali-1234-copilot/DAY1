// Module 3 - Q3
// Demonstrate polymorphism using method overriding with a base
// class Shape and derived classes Circle and Rectangle.

public class Module3_Q3 {

    static class Shape {
        void draw() {
            System.out.println("Drawing a generic shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();    // upcasting
        Shape s2 = new Rectangle(); // upcasting

        s1.draw(); // calls Circle's draw (overridden)
        s2.draw(); // calls Rectangle's draw (overridden)
    }
}

