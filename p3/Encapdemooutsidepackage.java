package com.mjava.p3;

import com.mjava.p2.EncapsulationDemo;

public class Encapdemooutsidepackage extends EncapsulationDemo{

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
	//	System.out.println(obj.d); // public
	//	System.out.println(obj.b); // default
	//  System.out.println(obj.c); // protected works only when is-a relation 
        System.out.println(obj.d);
	}
    public void test() {
    	System.out.println(c); // here we can directly access protected as we are inherting .
    }
}
