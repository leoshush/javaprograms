package com.mjava.p6;

import java.io.Serializable;

public class AddWithSerializable implements Serializable{
   int num1;
   int num2;
   int num3;
   
   
   public void setData(int num1,int num2) {
	   this.num1 = num1;
	   this.num2 = num2;
   }
   
   public void cal() {
	   this.num3 = this.num1 + this.num2;
   }
   public void display() {
	   System.out.println("This is number 3 "+num3);
   }
}
