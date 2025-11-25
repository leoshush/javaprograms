package com.mjava.p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args)
    {
    	ArrayList<String> empName = new ArrayList();
    	empName.add("Aman");
    	empName.add("naman");
    	empName.add("ishan");
    	
    	Collections.sort(empName);
    	
    	for(int i=0;i<empName.size();i++) {
    		System.out.println(empName.get(i));
    	}
    	for(String x:empName)
    	{
    		System.out.println(x + "");
    	}
    	Iterator<String>it = empName.iterator();
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	empName.forEach((x)->System.out.println(x+""));
    	
    	empName.forEach(System.out :: print); // using for each consumer and method reference
    	
    	
    }
    public static void psv(Integer x) {
    	System.out.println(x+"--->+...."); 
    }
}
