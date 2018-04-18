package com.rahul.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferncePointMapping {

    
    

    @JsonProperty
    private double distanceKM;
    private Reference referencePoint;
    List<Map<String, Double>> array = new ArrayList<>();
    

    
    public Reference getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(
            Reference referencePoint) {
        this.referencePoint = referencePoint;
    }

    
    public double getDistance() {
        return distanceKM;
    }

    public void setDistance(
            double distance) {
        this.distanceKM = distance;
    }

    public List<Map<String, Double>> getArrayOfPoints() {
        return array;
    }

    public void setArrayOfPoints(
            List<Map<String, Double>> arrayOfPoints) {
        this.array = arrayOfPoints;
    }

}
