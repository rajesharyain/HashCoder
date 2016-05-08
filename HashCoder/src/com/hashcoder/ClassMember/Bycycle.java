package com.hashcoder.ClassMember;


class Bycyle {
	private static int gear=4;
	private String name;
	private String description="Bycycle various model";
	private String color;
	
	public static int getGear() {
		return gear;
	}
	public static void setGear(int gear) {
		Bycyle.gear = gear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}