package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassCourseListTest {

    @Test
    void initializeFromFile() {
    }
    /*Testing for course name*/
    @Test
    void findCourseByCourseName() {
        ClassCourseList courses = new ClassCourseList();
        String fileName = "src/main/resources/CourseInfo.txt";
        courses.initializeFromFile();
        assertEquals("SER515", String.valueOf(courses.findCourseByCourseName("SER515")));
        assertEquals(null, courses.findCourseByCourseName("CSE512"));
    }
}