package hacs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void login() {
    }

    @Test
    public void testAddAssignment() {
        Facade facade = new Facade();
        Course course = new Course("SER515", 0);
        facade.thePerson = new Student();
        facade.addAssignment(course);
        assertEquals(course.assignmentList.get(0).getClass(), Assignment.class);
    }

    @Test
    void viewAssignment() {
    }

    @Test
    void gradeSolution() {
    }

    @Test
    void reportSolutions() {
    }

    @Test
    void submitSolution() {
    }

    @Test
    void remind() {
    }
    /*Test for creating a new user*/
    @Test
    public void testCreateUser() {
        Facade facade = new Facade();
        UserInfoItem userinfoitem = new UserInfoItem();
        userinfoitem.userType = UserInfoItem.UserType.STUDENT;
        userinfoitem.strUserName = "user";
        facade.createUser(userinfoitem);
        assertEquals(facade.thePerson.userName, "user");
    }

    @Test
    void createCourseList() {
    }

    @Test
    void attachCourseToUser() {
    }

    @Test
    void selectCourse() {
    }

    @Test
    void courseOperation() {
    }
}