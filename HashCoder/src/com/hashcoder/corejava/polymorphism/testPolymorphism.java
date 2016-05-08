package com.hashcoder.corejava.polymorphism;

public class testPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RoadBike
		RoadBike roadbikeObj = new RoadBike(20,10,4);
		roadbikeObj.setTireWidth(4.5);
		//The printDescription method id polymorphic here
		roadbikeObj.printDescription();
		
		
		//MountBike
		MountBike mountbikeObj = new MountBike(40,3,3);
		mountbikeObj.setSuspensionType("Dual Suspension");
		//The printDescription method id polymorphic here
		mountbikeObj.printDescription();
	}


}
