package domain.entity;

import domain.model.LoadType;

public class Loads {
    public LoadType loadType;
    public double startPosition;
    public double endPosition;

    public Loads(LoadType loadType, double startPosition, double endPosition) {
        this.loadType = loadType;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    public double getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(double startPosition) {
        this.startPosition = startPosition;
    }

    public double getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(double endPosition) {
        this.endPosition = endPosition;
    }
}
