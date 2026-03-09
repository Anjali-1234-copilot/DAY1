class AgeLessThanEighteenException extends Exception {
    public AgeLessThanEighteenException(String message) {
        super(message);
    }
}

public class M5Q4 {

    static void checkAge(int age) throws AgeLessThanEighteenException {
        if (age < 18) {
            throw new AgeLessThanEighteenException("Age " + age + " is less than 18. Not allowed.");
        } else {
            System.out.println("Age " + age + " is valid.");
        }
    }

    public static void main(String[] args) {
        int age = 16;
        try {
            checkAge(age);
        } catch (AgeLessThanEighteenException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
