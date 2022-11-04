package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /*  Test for solution status marked as reported */
    @Test
    public void testToStringReported() {
        Solution sol = new Solution();
        sol.theAuthor = "RISHITHA M";
        sol.solutionFileName = "Solutions";
        sol.theGrade = 1;
        sol.reported = true;
        String string = "RISHITHA M" + "  " + "Solutions" + " Grade=" + "1" + "  " + "reported";
        assertEquals(sol.toString(), string);
    }

    /* test if solution grade is set or not */
    @Test
    public void testGetGradeIntReported() {
        Solution solution = new Solution();
        solution.theAuthor = "RISHITHA M";
        solution.solutionFileName = "Solutions";
        solution.theGrade = 1;
        solution.reported = true;
        assertEquals("1", solution.getGradeString());
    }

    /* Test solution grade when solution is not reported */
    @Test
    public void testGetGradeIntNotReported() {
        Solution sol = new Solution();
        sol.theAuthor = "RISHITHA M";
        sol.solutionFileName = "Solutions";
        sol.theGrade = 9;
        sol.reported = false;
        assertEquals("-1", sol.getGradeString());
    }

    /* test solution grade when type casting */
    @Test
    public void testGetGradeInt() {
        Solution sol = new Solution();
        sol.theAuthor = "RISHITHA M";
        sol.solutionFileName = "Solutions";
        sol.theGrade = 1;
        assertEquals(1, sol.getGradeInt());
    }

    /* Test for solution not reported  */
    @Test
    public void testSetReported() {
        Solution sol = new Solution();
        sol.theAuthor = "RISHITHA M";
        sol.solutionFileName = "Solutions";
        sol.setReported(false);
        assertEquals(false, sol.reported);
    }

    /* Test for solution set */
    @Test
    public void testIsReported() {
        Solution sol = new Solution();
        sol.theAuthor = "RISHITHA M";
        sol.solutionFileName = "Solutions";
        sol.setReported(false);
        assertEquals(false, sol.isReported());
    }
}