/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author USER-PC
 */
public class TaskNGTest {
    
    public TaskNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of displayCompletedTasks method, of class Task.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println("displayCompletedTasks");
        Task instance = new Task();
        instance.displayCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class Task.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        Task instance = new Task();
        instance.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Task.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        Task instance = new Task();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Task.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "";
        Task instance = new Task();
        instance.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Task.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "";
        Task instance = new Task();
        instance.deleteTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTaskReport method, of class Task.
     */
    @Test
    public void testDisplayTaskReport() {
        System.out.println("displayTaskReport");
        Task instance = new Task();
        instance.displayTaskReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
