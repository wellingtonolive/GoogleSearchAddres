package br.com.google.service;

import br.com.google.model.request.RequestGitPR;
import br.com.google.model.response.ResponseGitPR;
import br.com.google.resource.GitResource;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GitService {

    @Inject
    @RestClient
    GitResource gitResource;


    public ResponseGitPR createPR(){

        RequestGitPR requestGitPR = RequestGitPR.builder().title("teste").body("teste").head("develop").base("master").build();

        String token = "Bearer mytoken";

        ResponseGitPR pr = gitResource.createPr(requestGitPR, "wellingtonolive", "soccer", token);

        return pr;
    }
}
