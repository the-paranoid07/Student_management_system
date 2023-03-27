package com.example.student_management_system;

public class Student {

    private int rollNo;

    private String name;

    private int age;

    private  String mobileNo;

    public Student(int rollNo, String name, int age, String mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
