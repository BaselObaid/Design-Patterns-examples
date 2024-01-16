# Java Student Management System with Singleton Pattern

This Java application is a simple student management system that utilizes the Singleton design pattern for the database connection. The system includes a MySQL database connection, a `Student` class representing student entities, and a `StudentDao` class for handling database operations.

## Project Structure

The project is organized as follows:

- `com.designpattern.Main`: The main class to run the program, demonstrating the usage of the `StudentDao` and `StudentViewer`.
- `com.designpattern.Student`: Represents the student entity with basic attributes such as id, name, and age.
- `com.designpattern.StudentDao`: Implements the DAO pattern to interact with the MySQL database and retrieve student data.
- `com.designpattern.StudentViewer`: Provides a simple method to print a list of students to the console.
- `com.designpattern.DataBaseConnection`: Singleton class for establishing a connection to the MySQL database.

## Singleton Design Pattern

The Singleton pattern is implemented in the `DataBaseConnection` class



Setup
Database Configuration:

Ensure you have a MySQL server running.
Modify the DataBaseConnection class with your database URL, username, and password.
Dependencies:

This project uses JDBC for database connectivity. Ensure the JDBC driver is added to your project.
Run the Application:

Execute the Main class to run the program.
The program will retrieve student data from the database and print it to the console.