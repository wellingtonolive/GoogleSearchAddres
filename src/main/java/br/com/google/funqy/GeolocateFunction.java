package br.com.google.funqy;


import br.com.google.model.WifiAccessPointModel;
import br.com.google.model.request.RequestGeolocate;
import br.com.google.model.response.ResponseGeolocate;
import br.com.google.service.GeolocateService;
import br.com.google.util.SecretManager;
import io.quarkus.funqy.Funq;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.ArrayList;
import java.util.List;

public class GeolocateFunction {

    private static final Logger LOG = Logger.getLogger(GeolocateFunction.class);

    @Inject
    @RestClient
    GeolocateService geolocateService;

    WifiAccessPointModel wifiAccessPointModel = WifiAccessPointModel
            .builder()
            .macAddress("90:b9:31:a7:96:fd")
            .signalStrength(-0)
            .signalToNoiseRatio(0)
            .channel(11)
            .age(0)
            .build();

    List<WifiAccessPointModel> wifiAccessPointModelList = new ArrayList<WifiAccessPointModel>();

    //@GET
    @Funq("example")
    public String greets() {

        String response = SecretManager.getValue();

        return response;
    }




    @POST
    @Funq("macaddres")
    public ResponseGeolocate addressByMacAddress(RequestGeolocate requestGeolocate){

        wifiAccessPointModelList.add(wifiAccessPointModel);

        requestGeolocate = RequestGeolocate
                .builder()
                    .homeMobileNetworkCode(724)
                    .homeMobileNetworkCode(1)
                    .radioType("gms")
                    .considerIp("false")
                    .wifiAccessPoints(wifiAccessPointModelList)
                .build();

        ResponseGeolocate responseGeolocate = geolocateService.requestByMacAddress(requestGeolocate);

        return responseGeolocate;
    }

}
