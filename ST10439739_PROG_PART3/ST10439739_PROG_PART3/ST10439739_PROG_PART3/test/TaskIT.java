/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author unari
 */
public class TaskIT {
    
    public TaskIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of displayCompletedTasks method, of class Task.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println(" Developer entry for Test data fortasks 1-4 ");
        Task instance = new Task();
        instance.displayCompletedTasks();
   
    }

    /**
     * Test of displayLongestTask method, of class Task.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        Task instance = new Task();
        instance.displayLongestTask();
       
    }

    /**
     * Test of searchTaskByName method, of class Task.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("Create Login ");
        String taskName = " Mike Smith, Create Login";
        Task instance = new Task();
        instance.searchTaskByName(taskName);
   
    }

    /**
     * Test of searchTasksByDeveloper method, of class Task.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("Create Reports");
        String developerName = " Samantha Paulson ";
        Task instance = new Task();
        instance.searchTasksByDeveloper(developerName);
       
    }

    /**
     * Test of deleteTaskByName method, of class Task.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("Entry “Create reports” successfully deleted");
        String taskName = "Create Reports";
        Task instance = new Task();
        instance.deleteTaskByName(taskName);
      
    }

    /**
     * Test of displayTaskReport method, of class Task.
     */
    @Test
    public void testDisplayTaskReport() {
        System.out.println("displayTaskReport");
        Task instance = new Task();
        instance.displayTaskReport();
      
    }
    
}
