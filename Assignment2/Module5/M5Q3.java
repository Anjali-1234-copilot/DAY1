class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class M5Q3 {

    static void validateNumber(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Number cannot be negative.");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            validateNumber(-5);
        } catch (InvalidInputException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
