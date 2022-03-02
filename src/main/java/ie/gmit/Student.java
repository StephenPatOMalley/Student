package ie.gmit;

public class Student {
    String userName;
    String userEmail;

    public Student(String name, String email){
        if(name.length() > 3) {
            userName = name;
        }
        else{
            throw new IllegalArgumentException("Invalid Name");
        }
        if(email.length() > 10){
            userEmail = email;
        }
        else{
            throw new IllegalArgumentException("Invalid Email");
        }
    }
}
