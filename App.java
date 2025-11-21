package com.mjava;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int sum = 0;
        for(String x:args) {
        	sum = sum + Integer.parseInt(x);
        } 
       System.out.println("Sum = " + sum);
        
        
    }
}
