package br.com.google.config;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Getter
@Setter
@ConfigProperties(prefix = "google")
public class GeolocateConfig {

    @ConfigProperty(name = "geolocate.key")
    private String applicationKey;
}
