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
}
