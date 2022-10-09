package com.techno.javabasic.restaurtant;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] menu = new String[] { "idly", "dosa", "poori", "wada" };
		int[] price = new int[] { 20, 35, 40, 35 };
		int[] qt=new int[4];
		int sum = 0;
		boolean quit = true;
//		int order = scanner.nextInt();
		do {
			System.out.println("Menu \t\t price");
			for (int i = 0; i < 4; i++) {
				System.out.println((i + 1) + menu[i] + " \t\t " + price[i]);
			}
//			System.out.print("Order your menu : ");
		    int order = scanner.nextInt();
			if (order > 0 && order <=4) {
                System.out.print("Order your menu : "+menu[order-1]+"\n");
                System.out.println("Enter the no of quality:");
                int q=scanner.nextInt();
                qt[order-1]+=q;
                System.out.println("Would you like to order another menu:1.Yes 2.No");
                String neworder=scanner.next();
                if(neworder.equalsIgnoreCase("yes")) {
                	 System.out.print("Order menu");
                	 int anotherorder = scanner.nextInt();
                	System.out.print("Order your menu : "+menu[anotherorder-1]+"\n");
                	System.out.println("Enter the no of quality:");
                    int q1=scanner.nextInt();
                    qt[order-1]+=q;
                }
                
			}
			else {
			quit=false;
			}
	} while (false);
       System.out.println("Your orders are:");
       for(int i=0;i<4;i++)
       {
    	   if(qt[i]!=0)
    	   {
    		   sum+=qt[i]*price[i];
    		   System.out.println(menu[i]+ "*" +qt[i]+"=="+qt[i]*price[i]);
    	   }
//    	   System.out.println("Your total bill is:"+sum);
       }
       System.out.println("Your total bill is:"+sum);
	}
}
