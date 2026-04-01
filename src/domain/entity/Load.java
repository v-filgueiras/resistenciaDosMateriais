package domain.entity;

public abstract class Load {

    protected double startPosition;
    protected double endPosition;

    public Load(double startPosition, double endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public double getStartPosition() {
        return startPosition;
    }

    public double getEndPosition() {
        return endPosition;
    }
}