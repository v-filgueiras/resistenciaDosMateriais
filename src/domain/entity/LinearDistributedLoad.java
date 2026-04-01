package domain.entity;

import domain.model.LoadType;

public class LinearDistributedLoad extends Load {
    public double startIntensity;
    public double endIntensity;
    public double startPosition;
    public double endPosition;

    public LinearDistributedLoad(double startPosition, double endPosition) {
        super(startPosition, endPosition);
    }

    public LinearDistributedLoad(double startPosition, double endPosition, double startIntensity, double endPosition1, double startPosition1, double endIntensity) {
        super(startPosition, endPosition);
        this.startIntensity = startIntensity;
        this.endPosition = endPosition1;
        this.startPosition = startPosition1;
        this.endIntensity = endIntensity;
    }

    public double getStartIntensity() {
        return startIntensity;
    }

    public void setStartIntensity(double startIntensity) {
        this.startIntensity = startIntensity;
    }

    @Override
    public double getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(double endPosition) {
        this.endPosition = endPosition;
    }

    @Override
    public double getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(double startPosition) {
        this.startPosition = startPosition;
    }

    public double getEndIntensity() {
        return endIntensity;
    }

    public void setEndIntensity(double endIntensity) {
        this.endIntensity = endIntensity;
    }

    public double calculateLinearDistributedLoad(LinearDistributedLoad linearDistributedLoad) {
        double length = (linearDistributedLoad.endPosition - linearDistributedLoad.startPosition);
        return ((length * linearDistributedLoad.endIntensity) / 2);
    }
}
