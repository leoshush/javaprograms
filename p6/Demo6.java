package com.mjava.p6;

import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

import com.mjava.Reed;

public class Demo6 {
	public static void main(String[] args) {
  	  try {
  		  String fname;
  		  System.out.println("Enter filename with path & extension");
  		  fname = Reed.sc.nextLine();
  		  File f1 = new File(fname);
  		  RandomAccessFile rm = new RandomAccessFile(f1,"rw");
  		  long fp = 0L;
  		  int ch=0;
  		  while((ch=rm.read())!=-1) {
  			  if(ch==97) {
  				  rm.seek(fp);
  				  rm.write(65);
  			  }
  			  fp++;
  			  System.out.println(ch);
  		  }
  		  rm.close();
  		  System.out.println("File processing done");
  	     }catch(Exception e) {
  			  
  		  }
    }
}
