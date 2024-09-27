import java.util.regex.Pattern;

public class AccountValidator {

    // Check if the username is valid
    public boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Check if the password is valid
    public boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        if (!Pattern.compile("[A-Z]").matcher(password).find()) return false; // Must contain an uppercase letter
        if (!Pattern.compile("[0-9]").matcher(password).find()) return false; // Must contain a number
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) return false; // Must contain a special character
        return true;
    }
}
