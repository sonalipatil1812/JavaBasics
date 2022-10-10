package com.techno.javabasic.Exception;

public class CheckedException1 extends Exception {
      String msg;
      public CheckedException1(String msg) {
		// TODO Auto-generated constructor stub
    	 this.msg=msg;
	}
      @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return msg;
    }
}
