package com.java.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.java.bean.State;

/*
 * As this is demo. We have created a seperate class for representation of Database
 */
public class StateService {

	static HashMap<Integer,State> stateIdMap=getStateIdMap();


	public StateService() {
		super();

		if(stateIdMap==null)
		{
			stateIdMap=new HashMap<Integer,State>();
			State bengalState=new State(1, "West Bengal",10000);
			State upState=new State(4, "UP",20000);
			State mpState=new State(3, "MP",8000);
			State rajasthanState=new State(2, "Rajasthan",7000);

			stateIdMap.put(1,bengalState);
			stateIdMap.put(4,upState);
			stateIdMap.put(3,mpState);
			stateIdMap.put(2,rajasthanState);
		}
	}

	public List<State> getAllState()
	{
		List<State> states = new ArrayList<State>(stateIdMap.values());
		return states;
	}

	public State getState(int id)
	{
		State state= stateIdMap.get(id);
		return state;
	}
	public State addState(State state)
	{
		state.setId(stateIdMap.size()+1);
		stateIdMap.put(state.getId(), state);
		return state;
	}
	
	public State updateState(State state)
	{
		if(state.getId()<=0)
			return null;
		stateIdMap.put(state.getId(), state);
		return state;

	}
	public void deleteState(int id)
	{
		stateIdMap.remove(id);
	}

	public static HashMap<Integer, State> getStateIdMap() {
		return stateIdMap;
	}


}
