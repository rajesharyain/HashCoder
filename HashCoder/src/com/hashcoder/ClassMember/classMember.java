package com.hashcoder.ClassMember;

public class classMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bycyle obj1 = new Bycyle();
		obj1.setName("Hero Honda");
		obj1.setColor("Red");
		
		Bycyle obj2 = new Bycyle();
		obj2.setName("Hero puk");
		obj2.setColor("Silver");
		
		
		//Changing the class variable gear to 2 will make the change in each object
		// The default gear set to 4 by class variable initilization
		// Here you see changig in the class variable will make the changes in every onject regardless this can be changed in any where.
		Bycyle.setGear(2);
		
		Bycyle obj3 = new Bycyle();
		obj3.setName("Activa");
		obj3.setColor("black");
		//Bycyle.setGear(3);
		
		Bycyle obj4 = new Bycyle();
		obj4.setName("Dio");
		obj4.setColor("White");
		
		
		
		System.out.println(" Obje1:  "+obj1.getName()+"  "+obj1.getColor()+"  gear: "+Bycyle.getGear());
		System.out.println(" Obje2:  "+obj2.getName()+"  "+obj2.getColor()+"  gear: "+Bycyle.getGear());
		System.out.println(" Obje3:  "+obj3.getName()+"  "+obj3.getColor()+"  gear: "+Bycyle.getGear());
		System.out.println(" Obje4:  "+obj4.getName()+"  "+obj4.getColor()+"  gear: "+Bycyle.getGear());
	}

}
