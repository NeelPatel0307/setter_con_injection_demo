package com.example.demo;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class Student {
    private int id;


    private String studentName;

    private List<String> subjects;

    private Map<String, String> marks;

    private Address address;

//    //SETTER INJECTION
//    public Map<String, String> getMarks() {
//        return marks;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public void setSubjects(List<String> subjects) {
//        this.subjects = subjects;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public void setMarks(Map<String, String> marks) {
//        this.marks = marks;
//    }
//
//
//    public Student(int id) {
//        this.id = id;
//    }
//
//    public Student(String studentName) {
//        this.studentName = studentName;
//    }




    //CONSTRUCTOR INJECTION
    public Student(int id, String studentName, List<String> subjects, Map<String, String> marks, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.subjects = subjects;
        this.marks = marks;
        this.address = address;
    }

    public void display() {

        System.out.println("----------------------------");
        System.out.println( id );
        System.out.println("----------------------------");
        System.out.println( studentName );
        System.out.println("----------------------------");
        System.out.println(address);
        System.out.println("----------------------------");
        System.out.println(subjects);
        System.out.println("----------------------------");
        System.out.println(marks);
        System.out.println("----------------------------");




    }
}
