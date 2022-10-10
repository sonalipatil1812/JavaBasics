package com.techno.javabasic.Exception;

public class OrderExceptionTest {
    public static void main(String[] args) {
		OrderException or=new OrderException();
		try {
			or.orderMenu();
		} catch (OrderMenuException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
