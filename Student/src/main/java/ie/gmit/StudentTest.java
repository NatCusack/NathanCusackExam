package ie.gmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;

public class StudentTest {

    static Student myStudent;

    @BeforeAll
    static void setUpClass()
    {
        myStudent = new Student("Chris Barry", "cbarry@gmit.ie");
    }
    @Test
    void testSetStudentNameToNull(){
        myStudent.setStudentName("");

    }
    @Test
    void testSetStudentEmailToNull(){
        myStudent.setStudentEmail("");
    }
    @Test
    void testStudentName()
    {
        myStudent.setStudentName("Murray Scott");
        assertEquals("Murray Scott", myStudent.getStudentName());
    }

    @Test
    void testStudentEmail()
    {
        myStudent.setStudentEmail("mscott@gmit.ie");
        assertEquals("mscott@gmit.ie", myStudent.getStudentEmail());
    }

}
