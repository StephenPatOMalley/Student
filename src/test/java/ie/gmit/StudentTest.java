package ie.gmit;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class StudentTest {

    @Test
    public void testStudentConstructor(){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = inputObj.nextLine();

        System.out.println("Enter Email");
        String email = inputObj.nextLine();

        //Student student = new Student(name, email);
    }
}
