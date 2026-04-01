package domain.entity;

import domain.model.LoadType;

public class MomentLoad extends Load {
    public double moment;
    public double position;

    public MomentLoad(double startPosition, double endPosition) {
        super(startPosition, endPosition);
    }

    public double getMoment() {
        return moment;
    }

    public void setMoment(double moment) {
        this.moment = moment;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
