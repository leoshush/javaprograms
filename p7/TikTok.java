package com.mjava.p7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TikTok  {
	List<String> l1 = new Vector<String>(Arrays.asList(new String[] 
			{"TWO", "THREE", "FOUR"," FIVE", "SIX", "SEVEN",
		    "EIGHT", "NINE", "TEN",
		    "JACK", "QUEEN", "KING"," ACE"}
));
 	List<String> p1 = new Vector<String>();
 	List<String> p2 = new Vector<String>();
	
 	public TikTok() {
 		Collections.shuffle(l1);
 		for (int i = 0; i < l1.size(); i++) {
			if(i%2==0)
 			  {p1.add(l1.get(i));}
			else {
				p2.add(l1.get(i));
			}
		}
 	}
	
  public synchronized void f1() {
	  try {
	  notify();
	  System.out.println(p1.remove(0));
	  wait();
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  }
  public synchronized void f2() {
	  try {
	  notify();
	  System.out.println(p2.remove(0));
	  wait();
	  
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  }
  public void finalize() {
	  try {
		notifyAll();
	} catch (Exception e) {
	}
  }
  
}

// now for rummy game for 2 players .