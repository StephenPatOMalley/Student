package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testStudentConstructor(){

        String name = "Chris Barry";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        assertEquals(name, studentOne.userName);
        assertEquals(email, studentOne.userEmail);
    }

    @Test
    public void testStudentNaemFail(){

        String name = "Ch";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        assertEquals(String.valueOf(new IllegalArgumentException("Invalid Name")), studentOne.userName);
        assertEquals(email, studentOne.userEmail);
    }

    @Test
    public void testStudentEmailFail(){

        String name = "Chris Barry";
        String email = "c@gmit.ie";

        Student studentOne = new Student(name, email);
        assertEquals(name, studentOne.userName);
        assertEquals(String.valueOf(new IllegalArgumentException("Invalid Email")), studentOne.userEmail);
    }
}
