package com.mavenproject.p1;

import com.mjava.Add;
import com.mjava.Arithmetic;
import com.mjava.Multiplication;
import com.mjava.Subtraction;

public class ArithmeticFactory {
   
   public static Arithmetic arr[]= new Arithmetic[] {
	new Add(),new Subtraction(),new Multiplication()	   
   };
   
   public static Arithmetic getArithmetic(int i) {
	   return arr[i];
   }
}
