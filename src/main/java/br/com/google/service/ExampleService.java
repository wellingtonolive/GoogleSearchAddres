package br.com.google.service;

import br.com.google.model.LocationModel;
import br.com.google.model.response.ResponseGeolocate;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class ExampleService {

    //@Fallback(fallbackMethod = "fallBackResponse")
    public Object getResponse() throws Exception {

        System.out.println("Entrou no metodo");

        LocationModel locationModel = LocationModel.builder().lat(56165).lng(21654).build();

        ResponseGeolocate responseGeolocate = ResponseGeolocate.builder().location(locationModel).accuracy(554).build();

        if(1==1){
            throw new Exception("Testando validação");
        }

        return responseGeolocate;
    }


    public Object fallBackResponse(){

        LocationModel locationModel = LocationModel.builder().lat(56165).lng(21654).build();

        return Response.serverError().entity(locationModel).build().getEntity();
    }
}
