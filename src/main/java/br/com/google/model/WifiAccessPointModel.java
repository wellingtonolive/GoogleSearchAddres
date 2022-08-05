package br.com.google.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WifiAccessPointModel {

    private String macAddress;
    private Integer signalStrength;
    private Integer signalToNoiseRatio;
    private Integer channel;
    private Integer age;
}
