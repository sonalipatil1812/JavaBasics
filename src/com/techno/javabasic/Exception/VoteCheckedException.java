package com.techno.javabasic.Exception;

import java.util.Scanner;

public class VoteCheckedException {
//     int age;
//     public VoteCheckedException(int age) {
//		// TODO Auto-generated constructor stub
//    	 this.age=age;
//	}
     public void checkAge(int age) throws CheckedException1 {
    	 if(age>=18) {
    		 System.out.println("Allowed For Voting");
    	 }else {
    		 throw new CheckedException1("Not Allowed For Voting");
    	 }
     }
     public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age :");
		int a=scanner.nextInt();
//		int b=scanner.nextInt();
		VoteCheckedException votecheckedException=new VoteCheckedException();
		try {
			votecheckedException.checkAge(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
