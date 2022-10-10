package com.techno.javabasic.Exception;

import java.util.Scanner;

public class OrderException {
	static Scanner scanner = new Scanner(System.in);
	static String[] menu = new String[] { "misal", "idly", "wada", "dosa", "tea", "coffe" };
	static int[] price = new int[] { 30, 35, 40, 50, 15, 12 };
	static int[] quantity = new int[10];
	static int sum = 0;

	public void orderMenu() {
		// TODO Auto-generated method stub
		System.out.println("menu" + "\t\tprice");
		for (int i = 0; i < menu.length; i++)
//		            int i=0;
			System.out.println((i + 1) + ")" + menu[i] + "\t\t" + +price[i]);
		System.out.println("Enter your order:");
		int order = scanner.nextInt();
		if (order < menu.length) {
//		if (order > 0 && order < 10) {
			System.out.println("enter the no of quantites of:" + menu[order - 1]);
			int q = scanner.nextInt();
			quantity[order - 1] += q;
			Again();
			System.out.println("Yours order are:");
			for (int i = 0; i < 4; i++) {
				if (quantity[i] != 0) {
					sum += quantity[i] * price[i];
					System.out.println(menu[i] + "*" + quantity[i] + "=" + quantity[i] * price[i]);
				}
			}
			System.out.println("Your total bill is:" + sum);
		} else {
			throw new OrderMenuException("Please order the correct menu...");
		}
	}

	public static void Again() {
		System.out.println("would you like to another order: 1.Yes 2.No");
		String anotherorder = scanner.next();
		if (anotherorder.equalsIgnoreCase("yes")) {
			System.out.println("Enter your order");
			int order = scanner.nextInt();
			if (order > 0 && order < 10) {
				System.out.println("enter the no of quantites of " + menu[order - 1]);
				int q = scanner.nextInt();
				quantity[order - 1] += q;
			}
		} else {
			System.out.println("Wait for....");
		}
	}
}
