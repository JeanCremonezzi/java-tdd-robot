package br.edu.ifsp.scl;

public class Robot {
    private Coordinate position;
    private int orientation;

    public Robot(Coordinate position, int orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    public Coordinate checkObstaclePosition(int beam, int distance) {
        return new Coordinate(0, 0);
    }
}
