package com.techno.javabasic.abstraction;

public class Audi implements Car {

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("This is audi break");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("This is audi acc");
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("This is audi gear");
	}

	@Override
	public void gps() {
		// TODO Auto-generated method stub
		System.out.println("This is audi gps");
	}
	
}
