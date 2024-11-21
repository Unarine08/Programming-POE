/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import java.util.function.IntPredicate;
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
public class EasyKanbanNGTest {
    
    public EasyKanbanNGTest() {
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
     * Test of main method, of class EasyKanban.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EasyKanban.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startApplication method, of class EasyKanban.
     */
    @Test
    public void testStartApplication() {
        System.out.println("startApplication");
        EasyKanban.startApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class EasyKanban.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        EasyKanban.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class EasyKanban.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        EasyKanban.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCompletedTasks method, of class EasyKanban.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println("displayCompletedTasks");
        EasyKanban.displayCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class EasyKanban.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        EasyKanban.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class EasyKanban.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        EasyKanban.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTaskReport method, of class EasyKanban.
     */
    @Test
    public void testDisplayTaskReport() {
        System.out.println("displayTaskReport");
        EasyKanban.displayTaskReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeArrays method, of class EasyKanban.
     */
    @Test
    public void testInitializeArrays() {
        System.out.println("initializeArrays");
        int size = 0;
        EasyKanban.initializeArrays(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumericInput method, of class EasyKanban.
     */
    @Test
    public void testGetNumericInput() {
        System.out.println("getNumericInput");
        String prompt = "";
        int expResult = 0;
        int result = EasyKanban.getNumericInput(prompt);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringInput method, of class EasyKanban.
     */
    @Test
    public void testGetStringInput() {
        System.out.println("getStringInput");
        String prompt = "";
        String expResult = "";
        String result = EasyKanban.getStringInput(prompt);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValidatedNumericInput method, of class EasyKanban.
     */
    @Test
    public void testGetValidatedNumericInput() {
        System.out.println("getValidatedNumericInput");
        String prompt = "";
        IntPredicate validator = null;
        int expResult = 0;
        int result = EasyKanban.getValidatedNumericInput(prompt, validator);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateTaskID method, of class EasyKanban.
     */
    @Test
    public void testGenerateTaskID() {
        System.out.println("generateTaskID");
        String taskName = "";
        int taskNumber = 0;
        String developer = "";
        String expResult = "";
        String result = EasyKanban.generateTaskID(taskName, taskNumber, developer);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
