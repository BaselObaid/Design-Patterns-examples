package com.designpattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private DataBaseConnection dataBaseConnection;
    private Connection connection;

    public StudentDao(){
            this.dataBaseConnection = DataBaseConnection.getInstance();
            this.connection = dataBaseConnection.getConnection();
    }

    public List<Student> getAllStudent() throws SQLException{

        ResultSet resultSet = createStatement().executeQuery("select * from students;");
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            int studentId = resultSet.getInt("id");
            String studentName = resultSet.getString("name");
            int studentAge = resultSet.getInt("age");
            Student student = new Student(studentId, studentName, studentAge); // Create a Student object
            students.add(student);
        }
        closeConnection();
        return students;
    }

    public Statement createStatement() throws SQLException{
            return connection.createStatement();
    }

    public void closeConnection() throws SQLException {
        dataBaseConnection.closeConnection();
    }

}
