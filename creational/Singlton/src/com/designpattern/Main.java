package com.designpattern;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            // First StudentDao instance
            StudentDao studentDao = new StudentDao();
            List<Student> students = studentDao.getAllStudent();
            StudentViewer.printStudents(students);


            System.out.println();

            // Second StudentDao instance
            StudentDao studentDao2 = new StudentDao();
            List<Student> students2 = studentDao2.getAllStudent();
            StudentViewer.printStudents(students2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
