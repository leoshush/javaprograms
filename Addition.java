package com.mjava;

public class Addition {
  int num1,num2,num3;
  
    public Addition() {
    	System.out.println("This is me ");
    }
	public void readData() {
	   System.out.println("Enter two numbers");
	   num1 = Reed.sc.nextInt();
	   num2 = Reed.sc.nextInt();
  }
	public void setData(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void compute()
	{
		this.num3 = this.num1 + this.num2;
	}
  public void display() {
	  System.out.println("num3 is " + this.num3);
  }
  // Destructor
  public void finalize() {
	  System.out.println("i am destructor");
  }{
	  System.out.println("Welcome to the anonymous block");
  }
  static {
	  System.out.println("this is the static block");
  }
  
}