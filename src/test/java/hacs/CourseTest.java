package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    /*testing for adding a new assignment*/
    @Test
    public void testAddAssignment() {
        Course course = new Course("SER515", 0);
        Assignment assignment = new Assignment();
        course.addAssignment(assignment);
        assertEquals(assignment, course.assignmentList.get(0));
    }
    /*test for course conversion to string*/
    @Test
    public void testToString() {
        Course course = new Course("SER515", 0);
        assertEquals("SER515", course.toString());
    }

    @Test
    void accept() {
    }
}