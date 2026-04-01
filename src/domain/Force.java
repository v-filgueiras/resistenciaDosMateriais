package domain;

public class Force {
    public double intensity;
    public boolean DirectionUp;

    public Force(double intensity, boolean directionUp) {
        this.intensity = intensity;
        DirectionUp = directionUp;
    }

    public boolean isDirectionUp() {
        return DirectionUp;
    }

    public void setDirectionUp(boolean directionUp) {
        DirectionUp = directionUp;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
}
