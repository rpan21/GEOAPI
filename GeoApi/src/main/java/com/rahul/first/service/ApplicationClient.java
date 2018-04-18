package com.rahul.first.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.pojo.CouplePoints;

public class ApplicationClient {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
     /*  ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());
        
        ObjectMapper objmap=new ObjectMapper();
        
        
        CouplePoints c=objmap.readValue(new FileReader("D:\\file.json"), CouplePoints.class);
        String xmlResponse = target.path("location").path("hello").queryParam("id", c).request()
                .get(String.class);
        // Get XML for application
        String xmlAppResponse =target.path("rest").path("todo").request()
                .accept(MediaType.APPLICATION_XML).get(String.class);

        // Get JSON for application
        String jsonResponse = target.path("rest").path("todo").request()
                .accept(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println(xmlResponse);
        System.out.println(xmlAppResponse);
        System.out.println(jsonResponse);*/
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri(
                "http://localhost:8080/GeoApi").build();
    }


}
