package com.mjava.p5;

import java.util.Collections;
import java.util.Vector;

public class Collection2 {
 public static void main(String[] args) {
	 Vector<Integer> b = new Vector<>();
	 b.add(54);
	 b.add(48);
	 b.add(98);
	 b.add(84);
	 b.add(102);
	 
	 b.remove(2);
	 Collections.sort(b);
	 
	 for(int i=0;i<b.size();i++)
	 {
		 System.out.println(b.get(i) + " ");
	 }
	 b.forEach((x)->System.out.println(x*x));
	 
 }
}
