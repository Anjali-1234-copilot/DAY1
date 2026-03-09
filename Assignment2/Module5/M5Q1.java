import java.io.IOException;

public class M5Q1 {

    // Method that throws a checked exception
    static void readFile() throws IOException {
        throw new IOException("Simulated IOException (checked exception)");
    }

    // Method that causes an unchecked exception
    static void causeRuntimeError() {
        int a = 10;
        int b = 0;
        int c = a / b; // ArithmeticException (unchecked)
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        // Checked exception example
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Unchecked exception example
        try {
            causeRuntimeError();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
