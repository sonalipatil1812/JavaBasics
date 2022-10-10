package com.techno.javabasic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 arrayList.add(10);
		 arrayList.add(20);
		 arrayList.add(30);
		 arrayList.add(40);
		 arrayList.add(50);
			 Iterator iter = arrayList.iterator();
			 while(iter.hasNext()) {
				 System.out.println(iter.next());
			 }
			 System.out.println("-------------");
			 ListIterator listIterator=arrayList.listIterator();
             while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
				
			}
             System.out.println("------------");
             while(listIterator.hasPrevious()) {
            	 System.out.println(listIterator.previous());
             }
		}

}
