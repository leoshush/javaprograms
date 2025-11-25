package com.mavenproject.p1;

import com.mjava.Arithmetic;

public class DemoArithmeticFac {
   public static void main(String[] args)
   {
	  Arithmetic obj = ArithmeticFactory.getArithmetic(0);
	  obj.setData(12, 23);
	  obj.cal();
	  obj.display();
	  
	   
   }
}
