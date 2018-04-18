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
import com.rahul.pojo.CouplePoints;
import com.rahul.pojo.Location;
import com.rahul.pojo.NearByPoints;
import com.rahul.pojo.ReferncePointMapping;

@Path("/distance")
public class LocationSort {

    @POST
    @Produces({"application/xml", "application/json", "text/plain", "text/html"})
    @Consumes(MediaType.APPLICATION_JSON)
    public Location sayPlainTextHello(
            CouplePoints inputJsonObj) {
        Location loc = new Location();
        final double distance = LocationService.getDistanceFromLatLonInKm(inputJsonObj.getLat1(),
                inputJsonObj.getLon1(), inputJsonObj.getLat2(), inputJsonObj.getLon2());
        loc.setDistanceInKm(distance);
        return loc;

    }

    
}
