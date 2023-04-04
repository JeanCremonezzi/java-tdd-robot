package br.edu.ifsp.scl;

public class Robot {
    private Coordinate position;
    private int orientation;

    public Robot(Coordinate position, int orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    public Coordinate checkObstaclePosition(int beam, int distance) {
        double obstacleOrientation = Math.toRadians(orientation - (beam - 90));

        int obstaclexAxis = (int) Math.floor(position.getxAxis() + (distance * Math.cos(obstacleOrientation)));
        int obstacleyAxis = (int) Math.floor(position.getyAxis() + (distance * Math.sin(obstacleOrientation)));

        return new Coordinate(obstaclexAxis, obstacleyAxis);
    }
}
