package generics.service;

import generics.models.Student;

public class StudentPrinter {
    
    Student student;

    public StudentPrinter(Student student) {
        this.student = student;
    }

    public void print() {
        System.out.println(student.toString());
    }
}
