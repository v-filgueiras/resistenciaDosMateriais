package domain.entity;

import domain.model.SupportType;

import java.util.List;

public class Beam {
    public double beamLength;
    public double referencePosition;
    public double intensity;
    public List<SupportType> support;
    public List<Loads> loads;

    public Beam(double beamLength, List<Loads> loads, List<SupportType> support, double referencePosition, double intensity) {
        this.beamLength = beamLength;
        this.loads = loads;
        this.support = support;
        this.referencePosition = referencePosition;
        this.intensity = intensity;
    }

    public double getBeamLength() {
        return beamLength;
    }

    public void setBeamLength(double beamLength) {
        this.beamLength = beamLength;
    }

    public List<Loads> getLoads() {
        return loads;
    }

    public void setLoads(List<Loads> loads) {
        this.loads = loads;
    }

    public List<SupportType> getSupport() {
        return support;
    }

    public void setSupport(List<SupportType> support) {
        this.support = support;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public double getReferencePosition() {
        return referencePosition;
    }

    public void setReferencePosition(double referencePosition) {
        this.referencePosition = referencePosition;
    }
}