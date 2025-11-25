package com.mjava.p6;

import java.util.LinkedHashMap;
import java.util.Map;

import com.mjava.Reed;

public class Demo2 {
  public static void main(String[] args) {
	  String sentence;
	  Map<String,Integer> mp = new LinkedHashMap<>();
	  System.out.println("Enter the sentence");
	  sentence = Reed.sc.nextLine();
	  
	  String arr[] = sentence.split("[ ]");
	  for(String x:arr) {
		  int y  = mp.getOrDefault(x,0);
		  y++;
		  mp.put(x, y);
	  }
	  System.out.println(mp);
  }
}
