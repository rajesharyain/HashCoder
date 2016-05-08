package com.hashcoder.corejava.inheritance;

public class OverridingExtendedClassExampleInheritance extends OverridingExampleInheritance{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExtendedClassExampleInheritance obj = new OverridingExtendedClassExampleInheritance();
		obj.testInstanceMethod();
		OverridingExtendedClassExampleInheritance.testStaticMethod();
		
		OverridingExtendedClassExampleInheritance obj1 = new OverridingExtendedClassExampleInheritance();
		obj1.testInstanceMethod();
		OverridingExampleInheritance.testStaticMethod();
		

	}
	
	@Override
	public void testInstanceMethod(){
		System.out.println("testInstanceMethod invoked from Subclass");
	}
	
	public static void testStaticMethod()
	{
		System.out.println("testStaticMethod invoked from Subclass");
	}
	


}
