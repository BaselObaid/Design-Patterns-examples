# Robot Builder

The Robot Builder project demonstrates the use of the Builder design pattern to construct Robot objects with various properties. It includes multiple solutions to address different issues encountered during the implementation.

## Problem Statement

The initial implementation of the `Robot` class suffers from code repetition and inflexibility when creating Robot objects with different properties. It includes multiple constructors with similar logic and lacks a clean separation between object creation and configuration.

## Solutions

### firstsolution Package

The `firstsolution` package presents an improvement to the initial implementation by introducing constructor chaining. This approach reduces code repetition by having constructors call one another, but it still suffers from scalability issues as the number of fields grows.

### secondsolution Package

The `secondsolution` package offers an alternative solution using special setter methods in the `Robot` class. By providing setters for each property, users have more control over object creation. However, this approach lacks enforcement of mandatory properties and may lead to incomplete objects.

### thirdsolution Package

The `thirdsolution` package introduces the Builder design pattern to address the shortcomings of previous solutions. It provides a `RobotBuilder` class that separates object creation from configuration, allowing users to fluently set properties and enforce mandatory settings before constructing a Robot object. This solution provides flexibility, scalability, and clarity in object creation.

## Example Usage

```java

public static void main(String[] args) {
    // Problem Statement Example Usage
        // Creating a Robot object with only type specified
        problem.Robot problemRobot1 = new problem.Robot("hbl");
        System.out.println("Problem Robot 1: " + problemRobot1);

        // Creating a Robot object with type, price, and guarantee specified
        problem.Robot problemRobot2 = new problem.Robot("bl", 2000, 2);
        System.out.println("Problem Robot 2: " + problemRobot2);

        // firstsolution Example Usage
        // Creating a Robot object with only type specified
        firstsolution.Robot firstSolutionRobot1 = new firstsolution.Robot("hbl");
        System.out.println("First Solution Robot 1: " + firstSolutionRobot1);

        // Creating a Robot object with type and price specified
        firstsolution.Robot firstSolutionRobot2 = new firstsolution.Robot("bl", 2000);
        System.out.println("First Solution Robot 2: " + firstSolutionRobot2);

        // secondsolution Example Usage
        // Creating a Robot object using setters
        secondsolution.Robot secondSolutionRobot = new secondsolution.Robot()
            .setType("hbl")
            .setPrice(3000)
            .setGuarantee(3);
        System.out.println("Second Solution Robot: " + secondSolutionRobot);

        // thirdsolution Example Usage
        // Creating a Robot using the RobotBuilder
        thirdsolution.Robot thirdSolutionRobot = new thirdsolution.RobotBuilder()
            .setType("hbl")
            .setPrice(3000)
            .setGuarantee(3)
            .build();
        System.out.println("Third Solution Robot: " + thirdSolutionRobot);

    }
```
