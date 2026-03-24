public class M5Q2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Result: " + result);
    }
}
