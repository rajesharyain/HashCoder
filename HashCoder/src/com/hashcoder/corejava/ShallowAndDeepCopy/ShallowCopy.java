package com.hashcoder.corejava.ShallowAndDeepCopy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShallowCopy {
	
	public static void main(String[] args) {
		
		try{

			Department dep = new Department(1, "Mechanical");
			
			//Shallow Copy
			/*Employee emp = new Employee(1,"Ravi",3000,dep);
			Employee empClone = (Employee) emp.clone();		*///memory location will be different in case of cloning the object.
			
			//Deep Copy
			DeepCopy emp = new DeepCopy(1,"Ravi",3000,dep);
			DeepCopy empClone = (DeepCopy) emp.clone();	
			
			System.out.println("Normal Object: ");
			System.out.println("Name: "+emp.getName() + ", Salary: "+emp.getSalary()+", Department: "+emp.getDept().getDepartMent());
			
			System.out.println();
			System.out.println("Cloned Object: ");
			System.out.println("Name: "+empClone.getName() + ", Salary: "+empClone.getSalary()+", Department: "+empClone.getDept().getDepartMent());
			
			System.out.println();
			
			System.out.println("Department is the contained object in the Employee Object. So if you ever try to modify the Contained object it will be reflected in both the cloned object as well as in the Normal object in case of Shallow copy,this is because the cloned object and the normal object shares the same memory location for the contained object. else all fields will not be reflected if any modification done in the normal object.");
			System.out.println();
			
			//Modify the contained Object as well as the original object field.
			System.out.println("After Modifying the contained object.");
			emp.getDept().setDepartMent("IT");
			emp.setName("Abhay");
			
			System.out.println("Normal Object: ");
			System.out.println("Name: "+emp.getName() + ", Salary: "+emp.getSalary()+", Department: "+emp.getDept().getDepartMent());
			
			
			System.out.println();
			System.out.println("Cloned Object: ");
			System.out.println("Name: "+empClone.getName() + ", Salary: "+empClone.getSalary()+", Department: "+empClone.getDept().getDepartMent());
			
				
			
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
