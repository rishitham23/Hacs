package hacs;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {
    /* Testing if the due date is set or not */
    @Test
    public void testSetDueDate() {
        Date today = new Date();
        Assignment assignment = new Assignment();
        assignment.setDueDate(today);
        assertEquals(today, assignment.dueDate);
    }
    /* Testing for specifications in assignment*/
    @Test
    void testSetAssSpec() {
        Assignment assignment = new Assignment();
        assignment.setAssSpec("STRING");
        assertEquals("STRING", assignment.assSpec);
    }
    /*Testing for overdue of assignment*/
    @Test
    void testIsOverDue() {
        Assignment assignment = new Assignment();
        Date testDate = new Date(2022- 11- 03);
        assignment.setDueDate(testDate);
        assertTrue(assignment.isOverDue());
        assignment.setDueDate(new Date());
        assertFalse(assignment.isOverDue());
    }
    /*Testing for adding a solution*/
    @Test
    public void testAddSolution() {
        Assignment assignment = new Assignment();
        Solution solution = assignment.addSolution();
        assertNotNull(solution);
    }

    @Test
    void testAddSolutionWithAttribute() {
        Assignment assignment = new Assignment();
        Solution solution = assignment.addSolution();
        assignment.addSolution(solution);
        Solution finalSolution = assignment.theSolutionList.get(0);
        assertEquals(solution, finalSolution);
    }

    @Test
    void submitSolution() {
    }

    @Test
    void getSolutionList() {
    }

    @Test
    void getSolution() {
    }

    @Test
    void getSugSolution() {
    }

    @Test
    void getSolutionIterator() {
    }

    @Test
    public void testToString() {
        Assignment assignment = new Assignment();
        assignment.assName = "StringConversionTesting";
        assertEquals("StringConversionTesting", assignment.toString());
    }

    @Test
    void getDueDateString() {
    }

    @Test
    void accept() {
    }
}