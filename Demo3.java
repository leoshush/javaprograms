package com.mjava;

public class Demo3 {
    public static void main(String[] args) {
    	Addition obj = new Addition();
        obj.setData(20, 30);
        obj.compute();
        obj.display();
       // Until we dont point the object to null garbage collection wont work. 
        obj = new Addition();
        
        System.gc();
       
    }
}
