package br.com.google.controller;

import br.com.google.model.response.ResponseGitPR;
import br.com.google.service.GitService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/api/v1")
public class UserController {

    @Inject
    GitService gitService;

    @GET
    @Path("/users/{id}")
    public String findUserById(@PathParam("id") String id) throws Exception {

        return "Response.ok().build()";

    }

    @GET
    @Path("/createPR")
    public ResponseGitPR createPR(){
        
        ResponseGitPR pr = gitService.createPR();

        return pr;
    }
}
