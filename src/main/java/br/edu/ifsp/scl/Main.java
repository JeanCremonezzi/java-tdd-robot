package br.edu.ifsp.scl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Robot X axis: ");
        final int robotxAxis = userInput.nextInt();

        System.out.println("Robot y axis: ");
        final int robotyAxis = userInput.nextInt();

        System.out.println("Robot orientation: ");
        final int robotOrientation = userInput.nextInt();

        System.out.println("Sensor beam: ");
        final int beam = userInput.nextInt();

        System.out.println("Sensor distance: ");
        final int distance = userInput.nextInt();

        Coordinate robotPosition = new Coordinate(robotxAxis, robotyAxis);
        Robot robot = new Robot(robotPosition, robotOrientation);

        Coordinate obstaclePosition = robot.checkObstaclePosition(beam, distance);

        System.out.println("Obstacle position is " + obstaclePosition.toString());
    }
}