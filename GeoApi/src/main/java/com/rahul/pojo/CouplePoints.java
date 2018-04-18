package com.rahul.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CouplePoints {

    @JsonProperty
    private double lat1;
    private double lat2;
    private double lon1;
    private double lon2;
    
    public CouplePoints(double lat1, double lat2, double lon1, double lon2) {
        super();
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lon1 = lon1;
        this.lon2 = lon2;
    }
    public CouplePoints() {
        super();
        // TODO Auto-generated constructor stub
    }
    public double getLat1() {
        return lat1;
    }
    public void setLat1(
            double lat1) {
        this.lat1 = lat1;
    }
    public double getLat2() {
        return lat2;
    }
    public void setLat2(
            double lat2) {
        this.lat2 = lat2;
    }
    public double getLon1() {
        return lon1;
    }
    public void setLon1(
            double lon1) {
        this.lon1 = lon1;
    }
    public double getLon2() {
        return lon2;
    }
    public void setLon2(
            double lon2) {
        this.lon2 = lon2;
    }
    
    
    
}
