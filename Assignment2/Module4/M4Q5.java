final class FinalClass {
    void display() {
        System.out.println("Inside final class.");
    }
}

class BaseClass {
    final void finalMethod() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class DerivedClass extends BaseClass {
    // Cannot override finalMethod() here; it would cause a compile-time error
}

public class M4Q5 {
    // final variable (constant)
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println("Final variable PI: " + PI);

        FinalClass finalClass = new FinalClass();
        finalClass.display();

        DerivedClass derived = new DerivedClass();
        derived.finalMethod();
    }
}
