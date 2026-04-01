package domain;

public class Force {
    public double positionOnBeam;
    public double intensity;
    public boolean DirectionUp;

    public Force(double positionOnBeam, double intensity, boolean directionUp) {
        this.positionOnBeam = positionOnBeam;
        this.intensity = intensity;
        DirectionUp = directionUp;
    }

    public double getPositionOnBeam() {
        return positionOnBeam;
    }

    public void setPositionOnBeam(double positionOnBeam) {
        this.positionOnBeam = positionOnBeam;
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
