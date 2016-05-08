package com.hashcoder.samplePrograms;

public class NodeUtil{

	public NodeUtil() {
		// TODO Auto-generated constructor stub
	}
	
	//Delete a Node from the LinkedList
	public Node delete(Node head, int position){
		
		if(head==null){
			throw new NullPointerException("You trying to delete a node which is empty");
		}
		
		if(position==0){
			head = head.next;//Delete the head element from linked list
		}
		else{
			Node currNode = head; //Head is the current node
			Node prevNode = null;     //For the initial time the previous node is null as at this point only one head element exists.
			int i=0;
			while(i < position){
				prevNode = currNode;
				currNode = currNode.next;
				i++;
			}
			prevNode.next = currNode.next;
		}
		return head;	
	}
	
	//Add a node
	public Node addNode(Node head,Object data){
		if(head==null)
		{
			head = new Node();
			head.data = data;
			
			System.out.println("Adding Head node" + head.data);
		}
		else
		{
			System.out.println("Adding subsequent node");
			Node currentNode = head;
			while(currentNode.next!=null)
			{
				currentNode = currentNode.next;	
			}
			currentNode.next = new Node();
			currentNode.next.data = data;	
		}
		return head;
	}
	
	public void ReversePrint(Node head) {
		if(head!=null)
		{
			ReversePrint(head.next);
			//currentNode = currentNode.next;		
			System.out.println(head.data);
		}
	
	}
	
	public void PrintList(Node head) {
		if(head!=null)
		{
				
			System.out.println(head.data);
			PrintList(head.next);
		}
	
	}
	

	public Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	   
	    /*while(node.next!=(position-1){
	        node.data = data;
	    }*/
		if(position==0){
			head.data = data;
		}
		else
		{
			int i=0;
			Node currNode = head;
			Node prevNode=null;
		    while(i < position)
		    {
		    	prevNode = currNode;//assiging the current node to prevNode for travarse purpose
		    	currNode = currNode.next;// going to the recoird where the new node needs to insert.
		    	i++;
		    }
		    prevNode.next.data = data;
		    prevNode.next.next = currNode.next;
		    
		}
	    	
	    return head;
	}


}
