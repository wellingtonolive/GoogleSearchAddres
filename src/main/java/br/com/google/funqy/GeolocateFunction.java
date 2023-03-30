package br.com.google.funqy;


import br.com.google.model.LocationModel;
import br.com.google.model.WifiAccessPointModel;
import br.com.google.model.request.RequestGeolocate;
import br.com.google.model.response.ResponseGeolocate;
import br.com.google.service.ExampleService;
import br.com.google.service.GeolocateService;
import io.quarkus.funqy.Funq;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class GeolocateFunction {

    private static final Logger LOG = Logger.getLogger(GeolocateFunction.class);

    @Inject
    @RestClient
    GeolocateService geolocateService;

    @Inject
    ExampleService exampleService;

    WifiAccessPointModel wifiAccessPointModel = WifiAccessPointModel
            .builder()
            .macAddress("90:b9:31:a7:96:fd")
            .signalStrength(-0)
            .signalToNoiseRatio(0)
            .channel(11)
            .age(0)
            .build();

    List<WifiAccessPointModel> wifiAccessPointModelList = new ArrayList<WifiAccessPointModel>();



    @Funq("hello")
    public String hello() throws Exception {

        if(1==1){

            throw new Exception("Erro ao pegar user");
        }

        return "tearawsd";
    }

}
