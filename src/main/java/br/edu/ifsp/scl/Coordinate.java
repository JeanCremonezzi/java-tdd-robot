package br.edu.ifsp.scl;

import java.util.Objects;

public class Coordinate {
    private final int xAxis;
    private final int yAxis;

    public Coordinate(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return xAxis == that.xAxis && yAxis == that.yAxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis);
    }

    @Override
    public String toString() {
        return "(" + xAxis + "," + yAxis + ")";
    }
}