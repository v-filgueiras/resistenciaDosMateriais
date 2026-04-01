package domain;

public class Beam {
    public double beamLength;

    public Beam(double beamLength) {
        this.beamLength = beamLength;
    }

    public double getBeamLength() {
        return beamLength;
    }

    public void setBeamLength(double beamLength) {
        if (this.beamLength <= 0) {
            throw new IllegalArgumentException("Beam length must be positive");
        }

        this.beamLength = beamLength;
    }
}