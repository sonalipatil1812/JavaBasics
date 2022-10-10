package com.techno.javabasic.Exception;

public class OrderMenuException extends RuntimeException{
      String msg;

	public OrderMenuException(String msg) {
//		super();
		this.msg = msg;
	}
      @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return msg;
    }
}
