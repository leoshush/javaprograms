package com.mjava.p7;

public class CompThread extends Thread {
   String n1;
   int m;
   public CompThread() {
	   n1 = "XYZ";
	   m = 10;
   }
   public CompThread(String n1, int m) {
	   this.n1 = n1;
	   this.m = m;
   }
   @Override
	public void run() {
		// TODO Auto-generated method stub
	 
	    for(int i=0;i<m;i++)
	    {
	    	System.out.println(n1+"..."+i);
	        try {
	        	Thread.sleep(100);
	        }catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        }
	    }
	    
   }
}
