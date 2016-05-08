package com.hashcoder.collection;

public class PrintNull {

	public PrintNull() {
		// TODO Auto-generated constructor stub
	}

	public void display (Object b){
		System.out.println("hello Object"+ b);
	}
	
	public void display (String b){
		System.out.println("hello String "+ b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestClass a = new  TestClass();
		//a.display(null);
		PrintNull p = new PrintNull();
		p.display(null);
	}

}

class TestClass
{
	public void display(String s){
		System.out.println(s);
	}
	public void display(int i){
		System.out.println(i);
	}
}
