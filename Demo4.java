package com.mjava;

import java.util.Scanner;

public class Demo4 {
     public static void main(String[] args) {
    	 int a = 063; //octal
    	  int  b = 63;
    	 System.out.println(a);
    	 System.out.println(b);
    	 
    	 System.out.println("Enter the number");
    	 Scanner sc = new Scanner(System.in);
    	 int num = sc.nextInt();
    	 String val1 = Integer.toBinaryString(num);
    	 String val2 = Integer.toOctalString(num);
    	 String val3 = Integer.toHexString(num);
    	 
    	 System.out.println("Binary value is" + val1);
    	 System.out.println("Octal value is" + val2);
    	 System.out.println("Hex value is " + val3);

     }
}
// Write a program to convert a integer hexadecimal , octal and binary.
// Create a matrix class which defines by default 3*3 matrix if the size is given it defines the matrix of respective size 
// create a behaviour to read data, have a copy constructor to read data.
// accept amount in figures and convert in words upto ten crores ;