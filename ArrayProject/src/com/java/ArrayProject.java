package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayProject {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add(12);
		arraylist.add(15);
		arraylist.add(20);
		System.out.println(arraylist);
		Iterator itr=arraylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
