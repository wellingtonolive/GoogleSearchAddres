package br.com.google.service;

import br.com.google.model.request.RequestGeolocate;
import br.com.google.model.response.ResponseGeolocate;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/geolocation/v1/geolocate")
@RegisterRestClient(configKey = "api")
public interface GeolocateService {

    @POST
    ResponseGeolocate requestByMacAddress(RequestGeolocate requestGeolocate);


}
