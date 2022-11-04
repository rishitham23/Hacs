package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionIteratorTest {

    @Test
    void moveToHead() {
    }

    @Test
    public void testHasNext() {
        Solution sol = new Solution();
        sol.solutionFileName = "RISHITHA M";
        SolutionList solutionlist = new SolutionList();
        solutionlist.add(sol);
        SolutionIterator test = new SolutionIterator(solutionlist);
        assertEquals(true, test.hasNext());
    }

    /* Test if solution iterator has null when given empty solution */
    @Test
    public void testHasNextNull() {
        SolutionList sollist = new SolutionList();
        SolutionIterator iterator = new SolutionIterator(sollist);
        assertEquals(false, iterator.hasNext());
    }

    /* test if solution iterator has next a new solution added to solution list */
    @Test
    public void testNext() {
        Solution sol = new Solution();
        sol.solutionFileName = "RISHITHA M";
        SolutionList solutionList = new SolutionList();
        solutionList.add(sol);
        SolutionIterator iterator = new SolutionIterator(solutionList);
        Solution testSolution = (Solution) iterator.next();
        assertEquals(sol.solutionFileName, testSolution.solutionFileName);
    }

    /* Test if solution iterator is null for empty solution list */
    @Test
    public void testNextNull() {
        SolutionList sollist = new SolutionList();
        SolutionIterator iterator = new SolutionIterator(sollist);
        Solution sol = (Solution) iterator.next();
        assertNull(sol);
    }
    @Test
    void remove() {
    }
}