package com.mjava.p5;

import java.util.TreeSet;

public class Set {
  public static void main(String[] args) {
	  TreeSet<Integer> age = new TreeSet<>();
	  age.add(12);
	  age.add(23);
	  age.add(43);
	  
	  TreeSet<Integer> age1 = new TreeSet<Integer>();
	  age1.add(13);
	  age1.add(56);
	  age.addAll(age1);
	  
	  
  }
}
