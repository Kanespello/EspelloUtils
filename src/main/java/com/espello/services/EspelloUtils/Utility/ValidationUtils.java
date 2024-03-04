package com.espello.services.EspelloUtils.Utility;

import org.springframework.stereotype.Service;

@Service
public class ValidationUtils {
    /**
     * Validates a name.
     * A valid name is assumed to contain only letters (either lowercase or uppercase) and spaces,
     * and it must start with a letter. This is a basic example and might need to be adjusted
     * based on specific requirements.
     *
     * @param name the name to validate
     * @return true if the name is valid, false otherwise
     */
    public boolean isValidName(String name) {
        return name != null && name.matches("^[A-Za-z][A-Za-z ]*$");
    }

    /**
     * Validates an email address.
     * Uses a simple regex pattern for validation which covers most common email formats.
     * For more complex validation requirements, consider using a more detailed regex or a library.
     *
     * @param email the email to validate
     * @return true if the email is valid, false otherwise
     */
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }
}
