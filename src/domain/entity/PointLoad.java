package domain.entity;

import domain.model.LoadType;

public class PointLoad extends Load {

    private double magnitude;
    private double position;

    public PointLoad(double startPosition, double endPosition) {
        super(startPosition, endPosition);
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}