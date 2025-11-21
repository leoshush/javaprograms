package com.mjava;

public class Demo8 {
    public static void main(String[] args) {
    	Arithmetic ob2[] = new Arithmetic[3];
    	
    	ob2[0] = new Add();
    	ob2[1] = new Subtraction();
    	ob2[2] = new Multiplication();
    	
    	System.out.println("Enter 1 for add , enter 2 for subtraction , enter 3 for multiplication");
    	int ch  = Reed.sc.nextInt();
    	System.out.println("Enter two numbers");
    	ob2[ch-1].setData(Reed.sc.nextInt(), Reed.sc.nextInt());
    	ob2[ch-1].cal();
    	ob2[ch-1].display();
    	
    }
}
