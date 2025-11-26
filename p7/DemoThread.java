package com.mjava.p7;

public class DemoThread {
    public static void main(String[] args) throws Exception
    {
    	System.out.println("i am in main company thread t1");
    	CompThread t1 = new CompThread("Infoedge",1);
    	CompThread t2 = new CompThread("sdfhahhif",5);
    	CompThread t3 = new CompThread("sdfha",2);
    	t1.start();
    	t2.start();
    	t3.start();
    	
    	t1.join();
    	t2.join();
    	t3.join();
    	
    	
    	System.out.println("Program over");

    }
}
