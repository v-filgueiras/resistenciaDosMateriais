package domain.entity;

import domain.model.LoadType;

public class UniformDistributedLoad extends Load {
    public double intensity;

    public UniformDistributedLoad(double startPosition, double endPosition) {
        super(startPosition, endPosition);
    }

    public UniformDistributedLoad(double startPosition, double endPosition, double intensity) {
        super(startPosition, endPosition);
        this.intensity = intensity;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public double calculateUniformDistributedLoad(UniformDistributedLoad uniformDistributedLoad) {
        double length = (uniformDistributedLoad.endPosition - uniformDistributedLoad.startPosition);
        return (length * uniformDistributedLoad.intensity);
    }
}
