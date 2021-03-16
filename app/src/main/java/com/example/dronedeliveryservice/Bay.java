package com.example.dronedeliveryservice;
import java.util.*;
public class Bay {
	private double battery=0;
	private boolean ready=false;
	private int weight = 0; //weight class 0 is default 1=small 2=medium 3=large
	private int bayID=0;
	private Drone drone = new Drone();
	
	public Bay() {
		
	}
	
	public Bay(int bayID, boolean ready) {
		this.ready=ready;
		this.bayID=bayID;
	}
	
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public void setDrone(Drone droneID) {
		
	}
	
	public void setBattery(double battery) {
		this.battery=battery;
	}
	
	public void setReady(boolean ready) {
		this.ready=ready;
	}
	public void setID(int bayID) {
		this.bayID=bayID;
	}
	
	public int getID() {
		return this.bayID;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public boolean getReady() {
		return this.ready;
	}
	
	public Drone getBattery() {
		return getBattery();
	}

}
