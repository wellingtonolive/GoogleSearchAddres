package br.com.google.resource;

import br.com.google.model.request.RequestGitPR;
import br.com.google.model.response.ResponseGitPR;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/repos")
@RegisterRestClient(configKey = "git")
public interface GitResource {

    @POST
    @Path("/{owner}/{repo}/pulls")
    ResponseGitPR createPr(RequestGitPR body,
                           @PathParam("owner") String owner,
                           @PathParam("repo") String repo,
                           @HeaderParam("Authorization") String token);
}
