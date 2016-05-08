package com.hashcoder.InstanceOf;

public class InstanceOfOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj1 = new ParentClass();
		ChildClass obj2 = new ChildClass();
		
		System.out.println("obj1 Instamce of Parent : "+ (obj1 instanceof ParentClass));
		System.out.println("obj1 Instamce of ChildClass : "+ (obj1 instanceof ChildClass));
		System.out.println("obj1 Instamce of MyInterface : "+ (obj1 instanceof MyInterface));
		
		System.out.println("obj2 Instamce of Parent : "+ (obj2 instanceof ParentClass));
		System.out.println("obj2 Instamce of ChildClass : "+ (obj2 instanceof ChildClass));
		System.out.println("obj2 Instamce of MyInterface : "+ (obj2 instanceof MyInterface));

	}

}
