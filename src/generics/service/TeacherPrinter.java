package generics.service;

import generics.models.Teacher;

public class TeacherPrinter {
    
    Teacher teacher;

    public TeacherPrinter(Teacher teacher) {
        this.teacher = teacher;
    }

    public void print() {
        System.out.println(teacher.toString());
    }
}
