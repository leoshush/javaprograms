package com.mjava.p6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo8 {
   public static void main(String[] args) {
	   try {
		   FileInputStream fi  = new FileInputStream("x.rm");
		   AddWithSerializable ob =(AddWithSerializable) new ObjectInputStream(fi).readObject();
		   ob.display();
	   }catch(Exception e) {
		   
	   }
   }
}
