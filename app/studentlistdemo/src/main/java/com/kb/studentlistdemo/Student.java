package com.kb.studentlistdemo;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private int attendance;

    public Student(int rollNo, String firstName, String lastName, int attendance) {
        this.rollNo =rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.attendance = attendance;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", attendance=" + attendance + '}';
    }
}
