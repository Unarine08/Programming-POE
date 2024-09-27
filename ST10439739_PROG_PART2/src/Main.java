import java.util.Scanner;

public class Main {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private final AccountValidator validator; // Object to use validation methods

    // Constructor to initialize the validator
    public Main() {
        this.validator = new AccountValidator();
    }

    // Method to create a new user account
    public void createAccount(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("\nAccount created successfully!");
    }

    // Method to login user and verify the credentials
    public boolean login(String username, String password) {
        if (this.username == null || this.password == null) {
            System.out.println("No user found, please create an account first.");
            return false;
        }

        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful! Welcome " + this.firstName + " " + this.lastName);
            return true;
        } else {
            System.out.println("Login failed! Invalid username or password.");
            return false;
        }
    }

    // Main method for program execution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main mainSystem = new Main(); // Create an instance of Main

        // Keep asking for valid account creation details using a while loop
        boolean isAccountCreated = false;

        System.out.println("Create an account:");

        while (!isAccountCreated) {
            System.out.print("Enter username (must contain an underscore and be no more than 5 characters long): ");
            String username = scanner.nextLine();

            System.out.print("Enter password (must be at least 8 characters long, contain a capital letter, a number, and a special character): ");
            String password = scanner.nextLine();

            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            // Using validator to check the validity of username and password
            if (!mainSystem.validator.isValidUsername(username)) {
                System.out.println("Invalid username! Username must contain an underscore and be no more than 5 characters long.");
            } else if (!mainSystem.validator.isValidPassword(password)) {
                System.out.println("Invalid password! Password must be at least 8 characters long, contain a capital letter, a number, and a special character.");
            } else {
                mainSystem.createAccount(username, password, firstName, lastName);
                isAccountCreated = true;
            }
        }

        // Proceed to login if account creation is successful
        System.out.println("\nLogin:");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        // Attempt login
        mainSystem.login(loginUsername, loginPassword);

        scanner.close();
    }
}
