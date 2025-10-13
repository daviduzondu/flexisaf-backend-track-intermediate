// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exceptions {
    // Method that throws custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register");
        } else {
            System.out.println("Registration successful");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed");
        }
    }
}
