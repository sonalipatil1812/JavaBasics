package com.techno.javabasic.abstraction;

public class CarTest {
       public static void main(String[] args) {
         Car car = CarFactory.getCar();  
         Driver driver=new Driver();
         driver.drive(car);
	}
}
