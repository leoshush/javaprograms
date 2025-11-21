package com.mjava.p1;

public abstract class ArithmeticClass implements ArithmeticInterface {
    int num1;
    int num3;
    int num2;
	@Override
	public void setData(int num1, int num2) {
		// TODO Auto-generated method stub
		this.num1 = num1;
		this.num2 = num2;
		
	}

	@Override
	public void display() {
	   System.out.println("num1"+num1 +"num2" + num2 + "num3" + num3);
		
	}
	

}
