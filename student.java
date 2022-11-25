package com.example.demo;


import java.util.List;
import java.util.Map;

public class student {


    private int id;
    private String studentName;
//SETTER INJECTION
    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    //CONSTRUCTOR INJECTION

//    public student(int id,String studentName) {
//        this.id = id;
//        this.studentName=studentName;
//    }

    public void display() {


        System.out.println("student name is :" + studentName  +"student id is" + id );
    }
}

package com.firstspring;

        import org.springframework.beans.factory.annotation.Required;

        import java.util.Iterator;
        import java.util.List;

        import java.util.Map;
        import java.util.Set;

public class Student {

    private int id;

    private String studentName;

    private List<String> subjects;

    private Map<String,String> marks;

    private com.firstspring.Address address;


    //SETTER INJECTION
    public Map<String, String> getMarks() {
        return marks;
    }

    public com.firstspring.Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }


    public List<String> getSubjects() {
        return subjects;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setAddress(com.firstspring.Address address) {
        this.address = address;
    }
    public void setMarks(Map<String, String> marks) {
        this.marks = marks;
    }
