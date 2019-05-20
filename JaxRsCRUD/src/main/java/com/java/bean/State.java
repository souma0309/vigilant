package com.java.bean;

public class State{
	
	int stateId;
	String stateName;	
	long statePopulation;
	
	public State() {
		super();
	}
	public State(int i, String stateName,long population) {
		super();
		this.stateId = i;
		this.stateName = stateName;
		this.statePopulation=population;
	}
	public int getId() {
		return stateId;
	}
	public void setId(int id) {
		this.stateId = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public long getPopulation() {
		return statePopulation;
	}
	public void setPopulation(long population) {
		this.statePopulation = population;
	}	
	
}