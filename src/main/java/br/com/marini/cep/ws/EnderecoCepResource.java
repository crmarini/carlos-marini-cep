package br.com.marini.cep.ws;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.service.EnderecoCepService;

@Path("/json")
public class EnderecoCepResource {
	@EJB
	EnderecoCepService service;
	
	@GET
	@Path("/rest-api/busca/{cepEscolhido}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getEnderecoCep(@PathParam("cepEscolhido") String numeroCep) {
		EnderecoCepDTO enderecoCepDTO = new EnderecoCepDTO();
		enderecoCepDTO.setNumeroCep(numeroCep);
		EnderecoCepDTO resposta = service.buscarEnderecoCep(enderecoCepDTO); 
		if(resposta.getStatus().equals("ERRO")){
			return Response.status(Status.BAD_REQUEST).entity(resposta).build();
		}
		return Response.status(Status.OK).entity(resposta).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/rest-api/cadastro")
	public Response cadastroCep(EnderecoCepDTO enderecoCepDTO) {
		EnderecoCepDTO resposta = service.cadastrarEnderecoCep(enderecoCepDTO);
		if(resposta.getStatus().equals("ERRO")){
			return Response.status(Status.BAD_REQUEST).entity(resposta).build();
		}
		return Response.status(Status.OK).entity(resposta).build();
	}
}