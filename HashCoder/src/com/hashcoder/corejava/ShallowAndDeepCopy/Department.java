package com.hashcoder.corejava.ShallowAndDeepCopy;

public class Department {

	private int departMentID;
	private String departMent;
	
	public int getDepartMentID() {
		return departMentID;
	}
	public void setDepartMentID(int departMentID) {
		this.departMentID = departMentID;
	}
	public String getDepartMent() {
		return departMent;
	}
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}
	
	public Department(int departMentID, String departMent)
	{
		this.departMent = departMent;
		this.departMentID=departMentID;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
}
