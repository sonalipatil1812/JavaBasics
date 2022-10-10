package com.techno.javabasic.Exception;

public class InsufficientBalanceException extends RuntimeException {
	String msg;
	public InsufficientBalanceException(String msg) {
		this.msg=msg;
	}
   @Override
public String getMessage() {
	// TODO Auto-generated method stub
	return msg;
}
}
