package com.mjava.p2;

public abstract class Arithmeticc2 implements Arithmetic2 {
    AddDto ob;
	@Override
	public void setData(AddDto obj) {
		// TODO Auto-generated method stub
		this.ob = obj;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Num 1=" +ob.getNum1()+"Num2 =" + ob.getNum2()+"Num3"+ ob.getNum3());
	}
  
}
