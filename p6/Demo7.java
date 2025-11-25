package com.mjava.p6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo7 {

	public static void main(String[] args) {
     try {
    	FileOutputStream fo = new FileOutputStream("x.rm");
    	AddWithSerializable ob = new AddWithSerializable();
    	ob.setData(45, 90);
    	ob.cal();
    	new ObjectOutputStream(fo).writeObject(ob);
    	fo.close();
    	System.out.println("Serialization over");
     }
     catch(Exception e) {
    	 e.getMessage();
     }

	}

}
