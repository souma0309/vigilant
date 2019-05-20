package com.java.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.bean.State;
import com.java.service.StateService;


@Path("/state")
public class StateController {
	
	StateService stateService=new StateService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<State> getState()
	{
		
		List<State> listOfStates=stateService.getAllState();
		return listOfStates;
	}

    @GET
    @Path("/{stateId}")
    @Produces(MediaType.APPLICATION_JSON)
	public State getStateById(@PathParam("stateId") int stateId)
	{
		return stateService.getState(stateId);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public State addState(State state)
	{
		return stateService.addState(state);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public State updateState(State state)
	{
		return stateService.updateState(state);
		
	}
	
    @DELETE
    @Path("/{stateId}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteState(@PathParam("stateId") int stateId)
	{
		 stateService.deleteState(stateId);
		
	}
	
}
