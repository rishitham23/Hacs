package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class ListIteratorTest {
    /*Test if the list iterator has next when looping*/
    @Test
    public void testHasNext() {
        ArrayList<Object> l1 = new ArrayList<>();
        Assignment assignment = new Assignment();
        l1.add(assignment);
        ListIterator i1 = new ListIterator(l1);
        assertTrue(i1.hasNext());

        ArrayList<Object> l2 = new ArrayList<>();
        ListIterator i2 = new ListIterator(l2);
        assertFalse(i2.hasNext());
    }
    /*Test if the list iterator has next when adding new assignment*/
    @Test
    public void testNextForNewAssignment() {
        ArrayList<Object> l = new ArrayList<>();
        Assignment assignment = new Assignment();
        l.add(assignment);
        ListIterator lIterator = new ListIterator(l);
        assertEquals(assignment, lIterator.next());
    }

    /* Test list iterator has null */
    @Test
    public void testNextNull() {
        ArrayList<Object> l = new ArrayList<>();
        ListIterator lIterator = new ListIterator(l);
        assertNull(lIterator.next());
    }
}