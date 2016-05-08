package com.hashcoder.samplePrograms;

public class AddNodeAtLast {

	public AddNodeAtLast() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NodeUtil nodeListAdd = new NodeUtil();
		Node currentNode = null;
		Node head = null;
		//Node newNode;
		int i = 1;
		
		while(i < 4)
		{
			currentNode = nodeListAdd.addNode(currentNode, i);
			if(i==1) head = currentNode;
			i++;
		}
		
		currentNode = nodeListAdd.addNode(head, null);
		
		System.out.println("*** Add the last node as 24 in the given node list below:");
		while (currentNode != null) {
		    System.out.println(currentNode.data);
		    currentNode = currentNode.next;
		}
		
	}

}
