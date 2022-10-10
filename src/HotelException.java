import java.util.Scanner;

import com.techno.javabasic.Exception.OrderMenuException;

public class HotelException {
	static Scanner scanner = new Scanner(System.in);
	static String[] menu = new String[] { "misal","idly", "wada", "dosa", "tea","coffe" };
	static int[] price = new int[] { 30, 35, 40, 50, 15, 12 };
	static int[] quantity = new int[10];
	static int sum = 0;
	 public void orderMenu() {
		 System.out.println("Menu \t\t Price");
		 for (int i = 0; i < menu.length; i++)
			 System.out.println((i+1)+"  "+ menu[i]+"  "+ price[i]);
	 }
}
