
import java.util.*;
/**
 * Task class for managing task details and functionality
 * Author: st10439739
 */
public class Task {
    
    private String[] developers;
private String[] taskNames;
private String[] taskIDs;
private int[] taskDurations;
private String[] taskStatuses;

    //Method to handle Initialize Arrays
private void initializeArrays(int numTasks) {
    developers = new String[numTasks];
    taskNames = new String[numTasks];
    taskIDs = new String[numTasks];
    taskDurations = new int[numTasks];
    taskStatuses = new String[numTasks];
}
//Method to handle Display Completed Tasks
public void displayCompletedTasks() {
    System.out.println("Tasks with status 'Done':");
    for (int i = 0; i < taskStatuses.length; i++) {
        if ("Done".equalsIgnoreCase(taskStatuses[i])) {
            System.out.println("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hrs");
        }
    }
}

//Method to handle Task with Longest Duration
public void displayLongestTask() {
    int maxIndex = 0;
    for (int i = 1; i < taskDurations.length; i++) {
        if (taskDurations[i] > taskDurations[maxIndex]) {
            maxIndex = i;
        }
    }
    System.out.println("Longest Task: Developer: " + developers[maxIndex] + ", Duration: " + taskDurations[maxIndex] + " hrs");
}

// Method to handle Search Task by Name
public void searchTaskByName(String taskName) {
    for (int i = 0; i < taskNames.length; i++) {
        if (taskNames[i].equalsIgnoreCase(taskName)) {
            System.out.println("Task Found - Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Status: " + taskStatuses[i]);
            return;
        }
    }
    System.out.println("Task not found.");
}

//Method to handle Search Tasks by Developer
public void searchTasksByDeveloper(String developerName) {
    System.out.println("Tasks assigned to " + developerName + ":");
    for (int i = 0; i < developers.length; i++) {
        if (developers[i].equalsIgnoreCase(developerName)) {
            System.out.println("Task Name: " + taskNames[i] + ", Status: " + taskStatuses[i]);
        }
    }
}

//Method to handle Delete Task by Name
public void deleteTaskByName(String taskName) {
    for (int i = 0; i < taskNames.length; i++) {
        if (taskNames[i].equalsIgnoreCase(taskName)) {
            System.out.println("Task '" + taskNames[i] + "' has been deleted.");
            developers[i] = null;
            taskNames[i] = null;
            taskIDs[i] = null;
            taskDurations[i] = 0;
            taskStatuses[i] = null;
            return;
        }
    }
    System.out.println("Task not found.");
}

//Method to handle Display Full Task Report
public void displayTaskReport() {
    System.out.println("Task Report:");
    for (int i = 0; i < taskNames.length; i++) {
        if (taskNames[i] != null) {
            System.out.println("Task ID: " + taskIDs[i]);
            System.out.println("Task Name: " + taskNames[i]);
            System.out.println("Developer: " + developers[i]);
            System.out.println("Duration: " + taskDurations[i] + " hrs");
            System.out.println("Status: " + taskStatuses[i]);
            System.out.println("---------------------------");
        }
    }
}


}
