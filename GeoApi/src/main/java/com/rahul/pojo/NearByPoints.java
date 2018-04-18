package com.rahul.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NearByPoints {

    public List<Map<String, Double>> arrayOfPoints = new ArrayList<>();

    public List<Map<String, Double>> getArrayOfPoints() {
        return arrayOfPoints;
    }

    public void setArrayOfPoints(
            List<Map<String, Double>> arrayOfPoints) {
        this.arrayOfPoints = arrayOfPoints;
    }
    
    
    
}
