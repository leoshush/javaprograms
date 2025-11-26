package com.mjava.p7;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.mjava.Reed;

public class Demo1 {
    public static void main(String[] args) {
    	Date dt = new Date();
    	System.out.println(dt);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
    	System.out.println(sdf.format(dt));
    	System.out.println("Enter the date");
    	try {
    		dt = sdf.parse(Reed.sc.nextLine());
    		System.out.println(sdf.format(dt));
    	}catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
    	
    }
}
//calendar , localdate , simpledate