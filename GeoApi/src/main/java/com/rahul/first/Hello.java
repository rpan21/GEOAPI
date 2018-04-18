package com.rahul.first;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.rahul.first.service.LocationService;
import com.rahul.pojo.Location;

@Path("/distance")
public class Hello {

  // This method is called if TEXT_PLAIN is request
    @GET
    @Produces({"application/xml", "application/json", "text/plain", "text/html"})
    public Location getTodos(@QueryParam ("lat1") double lat1,
            @QueryParam("lat2") double lat2,
            @QueryParam("lon1") double lon1,
            @QueryParam("lon2") double lon2) {
        Location loc=new Location();
        final double distance=LocationService.getDistanceFromLatLonInKm(lat1, lon1, lat2, lon2);
        loc.setDistanceInKm(distance);
        return loc;
    }

  
}
