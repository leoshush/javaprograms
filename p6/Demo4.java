package com.mjava.p6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo4 {
  public static void main(String[] args) {
	  String email = "aman456@gmail.com";
	  System.out.println(email.matches("[a-z]*[0-9]{3}[@][a-z]*(.com)"));
	  String password = "Aman@6584";
	  System.out.print(password.matches("[A-Za-z0-9]*[@][A-Za-z0-9]*"));
	  
	  try {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter two numbers");
		   String s1= br.readLine();
		   String s2 =br.readLine();
		   System.out.println("Sum"+ (Integer.parseInt(s2)+Integer.parseInt(s1)));
		   
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
  }
}
