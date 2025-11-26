package com.mjava.p7;

public class Player extends Thread {
   TikTok ob;
   public Player(TikTok ob1) {
	   this.ob = ob1;
   }
   public void run() {
   for(int i=0;i<7;i++)
   {
	   ob.f1();
   }
}
}