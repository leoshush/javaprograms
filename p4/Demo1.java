package com.mjava.p4;

import com.mjava.Reed;

public class Demo1 {
     public static void main(String[] args) {
    	 int balance = 25000;
    	 try {
    		 System.out.println("Enter the amount to withdraw");
    		 int amount = Reed.sc.nextInt();
    		 if(amount>balance) {
    			 throw new InsufficientBalance();
    		 }
    		 System.out.println("Please wait, yuor transaction is under process");
    	 }
    	 catch(InsufficientBalance e) {
    		 System.out.println(e.getMessage());
    	 }
     }
}
