package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    @Test
    public void testStudentListAdd(){

        String name = "Chris Barry";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        Student addStudent = new StudentList(studentOne);
    }
    @Test
    public void testStudentListEmpty(){

        String name = "Chris Barry";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        Student addStudent = new StudentList(studentOne);
    }
    @Test
    public void testStudentListSearch(){

        String name = "Chris Barry";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        Student addStudent = new StudentList(studentOne);
    }
    @Test
    public void testStudentListSearchNotFound(){

        String name = "Chris Barry";
        String email = "cbarry@gmit.ie";

        Student studentOne = new Student(name, email);
        Student addStudent = new StudentList(studentOne);
    }


}
