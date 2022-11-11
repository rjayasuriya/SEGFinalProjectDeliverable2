package com.example.finalproject;

import java.util.ArrayList;

public class Student {
    /*
- firstName: String
- lastName: String
- studentID: int
- enrolledCourses: arrayList[Class]
- creditedCourses: arrayList[Class]
*/
    public String password; // uml check
    public String studentID; // uml check
    public ArrayList<Class> enrolledCourses; // uml check

    public Student(String user, String pass){
        studentID=user;
        password=pass;
    }
    public String getPassword(){
        return password;
    } // uml check
    public String getstudentID(){
        return studentID;
    } // uml check
}
