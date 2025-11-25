package com.mjava.p6;

import java.io.File;

import com.mjava.Reed;

public class Demo5 {
      public static void main(String[] args) {
    	  try {
    		  String fname;
    		  System.out.println("Enter filename with path & extension");
    		  fname = Reed.sc.nextLine();
    		  File f1 = new File(fname);
    		  if(f1.exists()) {
    			  if(f1.isDirectory()) {
    				  System.out.println("Given is a directory");
    				  String[] arr = f1.list();
    				  for(String x: arr) {
    					  System.out.println(x);
    				  }
    			  }
    			  else {
    				  System.out.println("Given is a File");
    			  }
    		  }
    		  else {
    			  
    		  }
    	     }catch(Exception e) {
    			  
    		  }
      }
}
