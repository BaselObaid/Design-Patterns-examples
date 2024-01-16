package com.designpattern;

import java.util.List;

public class StudentViewer {

    public static void printStudents(List<Student>students){
        students.forEach(student -> {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        });
    }

}
