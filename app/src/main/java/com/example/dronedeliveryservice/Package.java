package com.example.dronedeliveryservice;

public class Package {
	private double weight;
	private double distance;
	
	public Package() {
		
	}
	
	public Package(double weight) {
		this.weight=weight;
	}
	
	public Package(double weight, double distance) {
		this.weight=weight;
		this.distance=distance;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public void setDistance(double distance) {
		this.distance=distance;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public double getWeight() {
		return weight;
	}

}
