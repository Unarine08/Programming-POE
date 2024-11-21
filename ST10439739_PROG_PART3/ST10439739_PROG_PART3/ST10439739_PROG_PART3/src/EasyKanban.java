import java.util.*;
import javax.swing.JOptionPane;

/**
 * Main class for user registration, login, and EasyKanban task management
 * Author: st10439739
 */
public class EasyKanban {
    // Arrays for storing task data
    private static String[] developers;
    private static String[] taskNames;
    private static String[] taskIDs;
    private static int[] taskDurations;
    private static String[] taskStatuses;

    public static void main(String[] args) {
        Login login = new Login();

        // User registration process
        boolean registered = false;
        while (!registered) {
            JOptionPane.showMessageDialog(null, "Please register your account.");
            String username = JOptionPane.showInputDialog(null, "Enter username:");
            String password = JOptionPane.showInputDialog(null, "Enter password:");
            String firstName = JOptionPane.showInputDialog(null, "Enter your first name:");
            String lastName = JOptionPane.showInputDialog(null, "Enter your last name:");

            login.setUsername(username);
            login.setPassword(password);
            login.setFirstName(firstName);
            login.setLastName(lastName);

            // Provide feedback on registration result
            String result = login.registerUser();
            JOptionPane.showMessageDialog(null, result);

            if (result.equals("Username and Password successfully captured")) {
                registered = true;
            }
        }

        // User login process
        boolean loggedin = false;
        while (!loggedin) {
            JOptionPane.showMessageDialog(null, "Registration complete. Please log in.");
            String inputUsername = JOptionPane.showInputDialog(null, "Enter username:");
            String inputPassword = JOptionPane.showInputDialog(null, "Enter password:");

            // Provide feedback on login result
            if (login.loginUser(inputUsername, inputPassword)) {
                loggedin = true;
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }

        startApplication();
    }

    /**
     * Initializes the main application menu.
     */
    public static void startApplication() {
        System.out.println("Welcome to EasyKanban!");
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getNumericInput("Enter your choice (1-6): ");
            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    displayCompletedTasks();
                    break;
                case 3:
                    displayLongestTask();
                    break;
                case 4:
                    searchTaskByName(getStringInput("Enter Task Name to Search: "));
                    break;
                case 5:
                    displayTaskReport();
                    break;
                case 6:
                    System.out.println("Exiting EasyKanban. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the numeric menu for the application.
     */
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1) Add Tasks");
        System.out.println("2) Display Completed Tasks");
        System.out.println("3) Display Longest Task");
        System.out.println("4) Search Task by Name");
        System.out.println("5) Display Task Report");
        System.out.println("6) Quit");
    }

    /**
     * Allows the user to add tasks to the system.
     */
    public static void addTasks() {
        int numTasks = getNumericInput("How many tasks would you like to add? ");
        initializeArrays(numTasks);

        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nEntering details for Task " + (i + 1) + ":");
            taskNames[i] = getStringInput("Enter Task Name: ");
            developers[i] = getStringInput("Enter Developer's Full Name: ");
            taskDurations[i] = getValidatedNumericInput("Enter Task Duration (hours): ", val -> val > 0);
            taskStatuses[i] = getStringInput("Enter Task Status (To Do, Doing, Done): ");
            taskIDs[i] = generateTaskID(taskNames[i], i, developers[i]);
            System.out.println("Task successfully added: " + taskIDs[i]);
        }
    }

    /**
     * Displays tasks with the status "Done".
     */
    public static void displayCompletedTasks() {
        System.out.println("Tasks with status 'Done':");
        for (int i = 0; i < taskStatuses.length; i++) {
            if ("Done".equalsIgnoreCase(taskStatuses[i])) {
                System.out.println("Developer: " + developers[i] + ", Task: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hrs");
            }
        }
    }

    /**
     * Displays the task with the longest duration.
     */
    public static void displayLongestTask() {
        int maxIndex = 0;
        for (int i = 1; i < taskDurations.length; i++) {
            if (taskDurations[i] > taskDurations[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Longest Task: Developer: " + developers[maxIndex] + ", Task: " + taskNames[maxIndex] + ", Duration: " + taskDurations[maxIndex] + " hrs");
    }

    /**
     * Searches for a task by its name.
     */
    public static void searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                System.out.println("Task Found - Developer: " + developers[i] + ", Status: " + taskStatuses[i]);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    /**
     * Displays a report of all tasks.
     */
    public static void displayTaskReport() {
        System.out.println("Task Report:");
        for (int i = 0; i < taskNames.length; i++) {
            System.out.println("Task ID: " + taskIDs[i] + ", Task: " + taskNames[i] + ", Developer: " + developers[i] + ", Duration: " + taskDurations[i] + " hrs, Status: " + taskStatuses[i]);
        }
    }

    // Utility Methods

    public static void initializeArrays(int size) {
        developers = new String[size];
        taskNames = new String[size];
        taskIDs = new String[size];
        taskDurations = new int[size];
        taskStatuses = new String[size];
    }

    public static int getNumericInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    public static int getValidatedNumericInput(String prompt, java.util.function.IntPredicate validator) {
        int value;
        do {
            value = getNumericInput(prompt);
            if (!validator.test(value)) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validator.test(value));
        return value;
    }

    public static String generateTaskID(String taskName, int taskNumber, String developer) {
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String developerEnd = developer.substring(developer.length() - 3).toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + developerEnd;
    }
}
