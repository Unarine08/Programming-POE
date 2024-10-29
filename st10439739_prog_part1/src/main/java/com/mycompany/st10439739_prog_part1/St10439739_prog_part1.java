package com.mycompany.st10439739_prog_part1;
import com.mycompany.st10439739_prog_part1.Login;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Main class for user registration, login, and EasyKanban task management
 * Author: st10439739
 */
public class St10439739_prog_part1 {
    public static void main(String[] args) {
        Login  login = new Login ();
        
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
        
        showMenu(login.getFirstName(), login.getLastName());
    }
    
    // Display main menu for EasyKanban
    public static void showMenu(String firstName, String lastName) {
         JOptionPane.showMessageDialog(null, "Welcome to EasyKanban, " + firstName + " " + lastName + ".");
         boolean running = true;
         while (running) {
            Object[] options = {"Add tasks", "Show report", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Please choose one of the following options:", "EasyKanban Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    addTasks();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    running = false;
                    break;
            }
        }
    }

    // Capture details for new tasks
    public static void addTasks() {
        int numTasks;
        do {
            numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to add?"));
            if (numTasks <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a positive number.");
            }
        } while (numTasks <= 0);

        Task[] tasks = new Task[numTasks];
        int totalHours = 0;

        for (int i = 0; i < numTasks; i++) {
            String taskName, taskDescription, developerDetails;
            int taskDuration;

            // Capture task name with validation
            do {
                taskName = JOptionPane.showInputDialog(null, "Enter the name of task " + (i + 1) + ":");
                if (taskName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Task name cannot be empty.");
                }
            } while (taskName.isEmpty());

            // Capture task description with character limit check
            do {
                taskDescription = JOptionPane.showInputDialog(null, "Enter task description (max 50 characters):");
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of 50 characters or less.");
                }
            } while (taskDescription.length() > 50);

            // Capture developer's name with validation
            do {
                developerDetails = JOptionPane.showInputDialog(null, "Enter developer's full name:");
                if (developerDetails.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Developer's name cannot be empty.");
                }
            } while (developerDetails.isEmpty());

            // Capture task duration in hours with positive number check
            do {
                taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter estimated duration of task (in hours):"));
                if (taskDuration <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                }
            } while (taskDuration <= 0);

            // Select task status from predefined options
            Object[] statusOptions = {"To Do", "Doing", "Done"};
            int statusOption = JOptionPane.showOptionDialog(null, "Select task status:", "Task Status",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
            String taskStatus = (String) statusOptions[statusOption];
            
            tasks[i] = new Task(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);

            JOptionPane.showMessageDialog(null, "Task successfully captured");
            JOptionPane.showMessageDialog(null, tasks[i].printTaskDetails());
            totalHours += tasks[i].returnTaskDuration();
        }

        JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + totalHours + " hrs");
    }
}
