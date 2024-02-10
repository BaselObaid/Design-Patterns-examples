
public class RobotOrder {

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
}
