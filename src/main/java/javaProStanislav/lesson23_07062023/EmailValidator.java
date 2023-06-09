package javaProStanislav.lesson23_07062023;

import java.util.Scanner;
import java.util.regex.Pattern;

class EmailValidationException extends Exception {
    public EmailValidationException(String message) {
        super(message);
    }
}

public class EmailValidator {
    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$");
    private static final int MAX_ATT = 3;

    public static void main(String[] args) {
        int attempts = 0;
        String[] invalidEmails = new String[MAX_ATT];

        Scanner scanner = new Scanner(System.in);
        while (attempts < MAX_ATT) {
            System.out.print("Enter an email address: ");
            String email = scanner.nextLine();
            try {
                validateEmail(email);
                System.out.println("Email is valid.");
                break;
            } catch (EmailValidationException e) {
                invalidEmails[attempts] = email;
                System.out.println("Invalid email: " + e.getMessage());
                attempts++;
            }
        }

        if (attempts == MAX_ATT) {
            System.out.println("Maximum attempts reached. Exiting program.");
            System.out.println("Invalid email attempts:");
            for (int i = 0; i < MAX_ATT; i++) {
                System.out.println((i + 1) + ". " + invalidEmails[i]);
            }
        }
    }

    public static void validateEmail(String email) throws EmailValidationException {
        if (!PATTERN.matcher(email).matches()) {
            throw new EmailValidationException("Invalid email format.");
        }
    }
}
