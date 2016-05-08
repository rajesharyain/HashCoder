package com.hashcoder.corejava.polymorphism;

public class MountBike extends Bicycle{

	private String suspensionType;
	
	public MountBike(int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		this.setSuspensionType(suspensionType);
		// TODO Auto-generated constructor stub
	}
	
	public String getSuspensionType() {
		return suspensionType;
	}
	
	public void setSuspensionType(String suspensionType) {
		this.suspensionType = suspensionType;
	}
	
	public void printDescription()
	{
		super.printDescription();
		System.out.println("The MountBike's suspenssion is "+ getSuspensionType() );
	}
	

}
