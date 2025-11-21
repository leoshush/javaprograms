package com.mjava.p4;

public class InsufficientBalance extends Exception {
    
	
	 public InsufficientBalance()
    {
    	 super("transaction is cancelled");
    }
}
