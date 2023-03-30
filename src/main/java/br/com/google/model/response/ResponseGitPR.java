package br.com.google.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseGitPR {

    @JsonProperty("url")
    private String url;

    @JsonProperty("id")
    private String id;
}
