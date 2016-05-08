package com.hashcoder.corejava.polymorphism;

public class Bicycle {
	private int startCadence;
	private int startSpeed;
    private int startGear;
    
    public Bicycle(int startCadence, int startSpeed, int startGear) {
		this.startCadence = startCadence;
		this.startSpeed = startSpeed;
		this.startGear = startGear;
	}
    
	public int getStartCadence() {
		return startCadence;
	}
	public void setStartCadence(int startCadence) {
		this.startCadence = startCadence;
	}
	public int getStartSpeed() {
		return startSpeed;
	}
	public void setStartSpeed(int startSpeed) {
		this.startSpeed = startSpeed;
	}
	public int getStartGear() {
		return startGear;
	}
	public void setStartGear(int startGear) {
		this.startGear = startGear;
	}
	
	public void printDescription()
	{
		System.out.println("The Bike is in gear "+ getStartGear() +" with a cadence "+ getStartCadence() +" in speed "+getStartSpeed() );
	}
   
    
}
