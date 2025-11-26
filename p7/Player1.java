package com.mjava.p7;

public class Player1 extends Thread{
	TikTok ob;
	   public Player1(TikTok ob1) {
		   this.ob = ob1;
	   }
	   public void run() {
	   for(int i=0;i<7;i++)
	   {  if(i<7) {
		    try {
		    	sleep(100);
		    }catch(Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }
		   ob.f2();
	   }
	   
	   }
	}
}
