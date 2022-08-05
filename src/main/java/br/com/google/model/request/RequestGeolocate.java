package br.com.google.model.request;

import br.com.google.model.WifiAccessPointModel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class RequestGeolocate {

    private Integer homeMobileCountryCode;
    private Integer homeMobileNetworkCode;
    private String radioType;
    private String considerIp;
    private List<WifiAccessPointModel> wifiAccessPoints;
}
