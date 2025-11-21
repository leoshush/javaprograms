package com.mjava;

public class Demo7 {
   public static void main(String[] args) {
	   Arithmetic obj = new Add();
	   obj.setData(12, 17);
	   obj.cal();
	   obj.display();
	   
	   obj = new Subtraction();
	   obj.setData(30, 20);
	   obj.cal();
	   obj.display();
	   
	   
   }
}
