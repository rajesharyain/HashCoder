package com.hashcoder.corejava.polymorphism;

public class RoadBike extends Bicycle{
	
	private double tireWidth;

	public double getTireWidth() {
		return tireWidth;
	}

	public void setTireWidth(double d) {
		this.tireWidth = d;
	}

	public RoadBike(int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(startGear);
		// TODO Auto-generated constructor stub
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("The Road Bike's Tire width is "+ getTireWidth() +" mm");
	}
	
}
