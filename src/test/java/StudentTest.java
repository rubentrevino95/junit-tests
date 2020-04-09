import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {

    @Test
    public void getStudentId() {
        Student student = new Student(1,"John");
        Student student2 = new Student(1,"Jane");
        Student student3 = new Student(1,"Joe");

    }

    @Test
    public void testIfConsturctorWorked(){
//        Student student = new Student();
//        assertNotNull(student);
    }

}
