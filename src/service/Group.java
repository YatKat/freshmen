package service;

import java.util.ArrayList;

public class Group {
    int number;
    String captain;
    ArrayList<Student> studentList;

    public Group(int number, ArrayList<Student> studentList) {
        this.number = number;
        this.studentList = studentList;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public String getCaptain() {
        return captain;
    }
    public void setCaptain(String captain) {
        this.captain = captain;
    }
}
