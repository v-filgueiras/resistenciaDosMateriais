package domain.entity;

import domain.model.SupportType;

import java.util.List;

public class Beam {
    public double beamLength;
    public double referencePosition;
    public List<SupportType> support;
    public List<Load> loads;

    public Beam(double beamLength, List<Load> loads, List<SupportType> support, double referencePosition) {
        this.beamLength = beamLength;
        this.loads = loads;
        this.support = support;
        this.referencePosition = referencePosition;
    }

    public double getBeamLength() {
        return beamLength;
    }

    public void setBeamLength(double beamLength) {
        this.beamLength = beamLength;
    }

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    public List<SupportType> getSupport() {
        return support;
    }

    public void setSupport(List<SupportType> support) {
        this.support = support;
    }

    public double getReferencePosition() {
        return referencePosition;
    }

    public void setReferencePosition(double referencePosition) {
        this.referencePosition = referencePosition;
    }
}