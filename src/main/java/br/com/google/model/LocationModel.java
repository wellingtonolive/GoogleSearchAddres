package br.com.google.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LocationModel {

    private Integer lat;
    private Integer lng;

}
