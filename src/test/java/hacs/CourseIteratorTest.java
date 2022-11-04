package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseIteratorTest {
    /*Testing of next function for course iterator*/
    @Test
    public void testHasNext() {
        ClassCourseList courses = new ClassCourseList();
        CourseIterator courseIterator = new CourseIterator(courses);
        assertFalse(courseIterator.hasNext());
    }

    @Test
    void next() {
    }

    @Test
    public void testCourseListInitialisation() {
        ClassCourseList courses = new ClassCourseList();
        courses.initializeFromFile();
    }

    /* Test for next value null */
    @Test
    public void testCourseIteratorNextValueNull() {
        ClassCourseList courses = new ClassCourseList();
        CourseIterator courseIterator = new CourseIterator(courses);
        assertNull(courseIterator.next());
    }

    /* Test for hasNext with attribute */
    @Test
    public void testNextWithAttribute() {
        ClassCourseList courses = new ClassCourseList();
        courses.initializeFromFile();
        CourseIterator courseIterator = new CourseIterator(courses);
        Course course = (Course) courseIterator.next("SER501");
        assertNull(course);
    }
    @Test
    void remove() {
    }

    @Test
    void testNext() {
    }
}