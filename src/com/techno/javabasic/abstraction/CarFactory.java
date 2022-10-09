package com.techno.javabasic.abstraction;

import java.util.Scanner;

public class CarFactory {
        public static Car getCar(){
        	Scanner scanner=new Scanner(System.in);
        	System.out.println("Enter the car name");
        	String str = scanner.next();
        	scanner.close();
        	if(str.equalsIgnoreCase("audi")) {
        		return new Audi();
        	}else if(str.equalsIgnoreCase("bmw")){
        		return new Bmw();
        	}
			return null;
        }
}
