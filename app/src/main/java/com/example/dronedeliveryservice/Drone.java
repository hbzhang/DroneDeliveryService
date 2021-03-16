package com.example.dronedeliveryservice;
import java.util.*;
public class Drone {
	private double battery=0;
	private int weight = 0; //weight class 0 is default 1=small 2=medium 3=large
	private int droneID=0;
	
	
	public Drone() {
		
	}
	
	public Drone(int droneID, int weight, double battery) {
		this.weight=weight;
		this.droneID=droneID;
		this.battery=battery;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public void setBattery(double battery) {
		this.battery=battery;
	}
	
	public void setID(int droneID) {
		this.droneID=droneID;
	}
	public int getWeight() {
		return this.weight;
	}
	
	public double getBattery() {
		return this.battery;
	}
	
	public int getID() {
		return this.droneID;
	}


}
