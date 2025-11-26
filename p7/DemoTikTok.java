package com.mjava.p7;

public class DemoTikTok {
    public static void main(String[] args) {
    	TikTok t1 = new TikTok();
    	Player p1 = new Player(t1);
    	Player1 p2 = new Player1(t1);
    	
    	p1.start();
    	p2.start();
    	t1 = null;
    	System.gc();

    }
}
