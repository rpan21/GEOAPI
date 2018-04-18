package com.rahul.pojo;

public class Location {

    private double distanceInKm;

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(
            double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    @Override
    public String toString() {
        return "Location [distanceInKm=" + distanceInKm + "]";
    }
    
    
}
