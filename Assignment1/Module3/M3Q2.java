// Module 3 - Q2
// Demonstrate single inheritance with a base class Animal
// and derived class Dog.

public class Module3_Q2 {

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // inherited method
        d.bark();  // own method
    }
}

