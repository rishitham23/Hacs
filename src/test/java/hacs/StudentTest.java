package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    /* test to create new course menu for low level courses */
    @Test
    public void testCreateCourseMenuLowLevel() {
        Student stu = new Student();
        Course course = new Course("SER515", 1);
        CourseMenu menu = stu.createCourseMenu(course, 1);
        assertTrue(menu instanceof LowLevelCourseMenu);
    }


    /* test to create new course menu for high level courses */
    @Test
    public void testCreateCourseMenuHighLevel() {
        Student stu = new Student();
        Course course = new Course("SER515", 0);
        CourseMenu menu = stu.createCourseMenu(course, 0);
        assertTrue(menu instanceof HighLevelCourseMenu);
    }

    /* test to add new courses */
    @Test
    public void testAddCourse() {
        Student stu = new Student();
        Course course = new Course("SER515", 0);
        stu.addCourse(course);
        assertEquals(course, stu.courseList.get(0));
    }

    /* Test to retrieve all the courses*/
    @Test
    public void testGetCourseList() {
        Student stu = new Student();
        Course course = new Course("SER515", 0);
        stu.addCourse(course);
        assertEquals(course, stu.getCourseList().get(0));
    }
}