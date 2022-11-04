package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    @Test
    public void testCreateCourseMenuLowLevel() {
        Instructor inst = new Instructor();
        Course course = new Course("SER515", 1);
        CourseMenu courseMenu = inst.createCourseMenu(course, 1);
        assertEquals(courseMenu.getClass(), LowLevelCourseMenu.class);
    }

    /* Test to create high level course menu */
    @Test
    public void testCreateCourseMenuHighLevel() {
        Instructor inst = new Instructor();
        Course course = new Course("SER515", 0);
        CourseMenu courseMenu = inst.createCourseMenu(course, 0);
        assertEquals(courseMenu.getClass(), HighLevelCourseMenu.class);
    }

    /* Test to add a new course to the instructor */
    @Test
    public void testAddCourse() {
        Instructor inst = new Instructor();
        Course course = new Course("SER515", 0);
        inst.addCourse(course);
        assertEquals(course, inst.courseList.get(0));
    }

    /* Test to get list of courses for instructor */
    @Test
    public void testGetCourseList() {
        Instructor inst = new Instructor();
        Course course = new Course("SER515", 0);
        inst.addCourse(course);
        assertEquals(course, inst.getCourseList().get(0));
    }

    @Test
    void createCourseMenu() {
        
    }

    @Test
    void showMenu() {
    }
}