package com.rahul.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rahul.first.service.LocationService;
import com.rahul.pojo.NearByPoints;
import com.rahul.pojo.ReferncePointMapping;

@Path("/nearby")
public class SortAlgorithm {

    
    @POST
    @Produces({"application/xml", "application/json", "text/plain", "text/html"})
    @Consumes(MediaType.APPLICATION_JSON)
    public NearByPoints nearByPoints(
            ReferncePointMapping inputJsonObj) {
        NearByPoints result = new NearByPoints();
        Map<Double, Map> temp = new LinkedHashMap<>();
        List<Double> distancelist=new ArrayList<Double>();
        double referenceDist=inputJsonObj.getDistance();
        for (int i = 0; i < inputJsonObj.getArrayOfPoints().size(); i++) {
            final double distance = LocationService.getDistanceFromLatLonInKm(inputJsonObj.getReferencePoint().getRefernce_lat(),
                    inputJsonObj.getReferencePoint().getRefernce_lon(), inputJsonObj.getArrayOfPoints().get(i).get("latitude"),
                    inputJsonObj.getArrayOfPoints().get(i).get("longitude"));
            temp.put(distance, inputJsonObj.getArrayOfPoints().get(i));
            distancelist.add(distance);
        }
        Collections.sort(distancelist);
        List<Map<String, Double>> arrayOfPoints = new ArrayList<>();
        for(int i=0;i<distancelist.size();i++){
            if(temp.containsKey(distancelist.get(i) ) || distancelist.get(i)>=referenceDist){
                break;
            }
            else if(distancelist.get(i) <= referenceDist) {
             arrayOfPoints.add(temp.get(distancelist.get(i)));
         }
            
            
        }
        result.setArrayOfPoints(arrayOfPoints);
        return result;

    }

    
}
