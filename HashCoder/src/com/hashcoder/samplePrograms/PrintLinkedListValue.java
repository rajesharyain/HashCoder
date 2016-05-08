package com.hashcoder.samplePrograms;

import java.util.ArrayList;
import java.util.List;


public class PrintLinkedListValue {

	public PrintLinkedListValue() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public void callme() 
	{
		System.out.println("Call me");
	}
	
	public static void callme1() {
		System.out.println("Call me 1");
	}	
	//list1 = new ArrayList();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1 --> 2 --> 3 --> NULL, position = 0
		PrintLinkedListValue link = new PrintLinkedListValue();
		link = null;
		
		
		
		Node node_1 = new Node(null,1); 
		Node node_2 = new Node(null,2);
		Node node_3 = new Node(null,3);
		Node node_4 = new Node(null,null);
		
		node_1.next = node_2;
		node_2.next = node_3;
		node_3.next = node_4;
		
		System.out.println("*** Print contents of Node list");
		Node  current = node_1;
		
		while (current != null) {
		    System.out.println(current.data);
		    current = current.next;
		}
		
		NodeUtil nodeListAdd = new NodeUtil();
		
		//Print list in reverse
		nodeListAdd.ReversePrint(node_1);
		
		/*Node node1 = nodeListAdd.InsertNth(node_1, 3, 0);
		
		nodeListAdd.PrintList(node1);
		*/
		
		/*
		NodeUtil nodeList = new NodeUtil();
		Node currentNodeAfterDelete = nodeList.delete(node_1, 1);
		
		System.out.println("*** Print contents of Node list after Delete Operation");
		
		Node currentNode = currentNodeAfterDelete;
		while (currentNode != null) {
		    System.out.println(currentNode.data);
		    currentNode = currentNode.next;
		}*/
		
		
		//Add a node dynamaclly
		
		/*NodeUtil nodeListAdd = new NodeUtil();
		Node currentNode = null;
		//Node newNode;
		int i = 0;
		
		while(i < 4)
		{
			currentNode = nodeListAdd.addNode(currentNode, i);
			i++;
		}
		//Node newNode = nodeListAdd.addNode(node_1, 23);
		System.out.println("*** After Add Operation");
		while (currentNode != null) {
		    System.out.println(currentNode.data);
		    currentNode = currentNode.next;
		}*/
	}
}


