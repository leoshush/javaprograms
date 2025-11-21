package com.mjava.p2;

public class Demo1 {
   public static void main(String[] args) {
	   AddDto dto = new AddDto();
	   dto.setNum1(30);
	   dto.setNum2(40);
	   
	   Arithmeticc2 obj = new Add();
	   obj.setData(dto);
	   obj.cal();
	   obj.display();
	   
	   
	   obj = new Subtraction();
	   obj.setData(dto);
	   obj.cal();
	   obj.display();
	   
   }
}
