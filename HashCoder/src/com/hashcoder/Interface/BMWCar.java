package com.hashcoder.Interface;

public class BMWCar implements InterfaceOperateCar {

	public void changeDirection(String direction) {
		// TODO Auto-generated method stub
		System.out.println("CHange The direction to "+direction);
	}

	public int changeSpeed(int speed) {
		// TODO Auto-generated method stub
		return speed;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMWCar carObj = new BMWCar();
		carObj.changeDirection("Right");
		int speedOfCar = carObj.changeSpeed(30);
		System.out.println("Speed of car "+speedOfCar);

	}

}
