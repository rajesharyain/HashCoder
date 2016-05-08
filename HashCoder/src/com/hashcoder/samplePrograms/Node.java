package com.hashcoder.samplePrograms;

public class Node {
	
	public Object data;
	public Node next;
	public Node() {
		
	}
	
	public Node(Node next, Object data)
	{
		this.next = next;
		this.data= data;
	}
}
