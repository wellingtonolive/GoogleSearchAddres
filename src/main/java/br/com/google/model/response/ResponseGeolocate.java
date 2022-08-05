package br.com.google.model.response;

import br.com.google.model.LocationModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseGeolocate {

    @JsonProperty("location")
    private LocationModel location;
    @JsonProperty("accuracy")
    private Integer accuracy;
}
